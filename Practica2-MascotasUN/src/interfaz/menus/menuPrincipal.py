# Se importan las librería a utilizar
from distutils import command
from tkinter import *
from tkinter import messagebox
"""from interfaz.pantallas.fieldFrame import *
from interfaz.pantallas.clientesValioso import ClienteValioso
from interfaz.pantallas.devolucion import Devolucion
from interfaz.pantallas.comision import Comision
from interfaz.pantallas.informeTienda import Informe
from interfaz.pantallas.consultaBDD import ConsultaBDD"""

class MenuPrincipal(Menu):
    
    #Se crea el método constructor
    def __init__(self, padre, controlador):
        # Se llama al padre (Menu), para que inicialice
        super().__init__(padre)
        
        # Atributos
        self._padre = padre
        self._controlador = controlador
        
        # Se crea la barra del menu con los submenus
        menuArchivos = Menu(self, tearoff=0)
        menuProcesos = Menu(self, tearoff=0)
        menuAyuda = Menu(self, tearoff=0)
        
        # se añaden los submenus a la barra del menu
        self.add_cascade(label="Archivo", menu=menuArchivos)
        self.add_cascade(label="Procesos y Consultas", menu=menuProcesos)
        self.add_cascade(label="Ayuda", menu=menuAyuda)
        
        self._values = {"tituloCriterios":"Atributos", "tituloValores":"Valores"}
        # Se crean los opciones de cada submenu
        
        # Para el caso del submenu Archivos
        menuArchivos.add_command(label="Aplicacion", command=self.informacionAplicativo)
        menuArchivos.add_command(label="Salir", command=self.salir)
        
        # Para el caso del submenu Procesos y Consultas
        menuProcesos.add_command(label="Gestionar Productos", command=self._gestionarProductos)
        menuProcesos.add_command(label="Gestionar Proveedores", command = self._gestionarProveedores)
        menuProcesos.add_command(label="Gestionar Usuarios", command=self._gestionarUsuarios)
        menuProcesos.add_command(label="Gestionar Vendedores", command = self._gestionarVendedores)
        menuProcesos.add_command(label="Realizar Venta", command=self._realizarVenta)
        menuProcesos.add_command(label="Comprar inventario", command=self._comprarInventario)
        menuProcesos.add_command(label="Cobrar comision", command=self._cobrarComision)
        menuProcesos.add_command(label="Ver estadisticas ventas", command=self._verEstadisticasVentas)
        menuProcesos.add_command(label="Recomendaciones Personalizadas", command=self._recomendacionesPersonalizadas)

        # Para el caso del submenu Ayuda
        menuAyuda.add_command(label="Acerca de", command=self.quienesSomos)
        
    def salir(self):
        self._controlador.deiconify()
        self._padre.destroy()
        
    def informacionAplicativo(self):
        messagebox.showinfo(
                title="Información Básica",
                message="MascotasUN es una aplicacion pensada para la gestión de facturacion e inventario de una tienda "
                        "de productos para mascotas vista desde un administrador  que es el vendedor y  al obtener este "
                        "producto de software tendra acceso a una aplicacion en la cual podra llevar control de la tienda"
            )
        
    def quienesSomos(self):
        messagebox.showinfo(
                title="Autores",
                message="Hinara Pastora Sanchez Mata \nAlejandra Uribe Sierra \n Anna Ospina Bedoya \n Juan Felipe Lopez Ramirez\nJuan Jose Tobon Zapata"
            )
        
    def _gestionarUsuarios(self):
        self._values["criterios"] = ["ID", "Nombre", "Fecha Nacimiento", "Dirección", "Teléfono"]
        self._values["habilitado"] = ["ID"]
        self._values["nombreProceso"] = "Gestionar cliente"
        self._values["descripcionProceso"] = "Guarda la informacion de un nuevo cliente"
        from gestionAplicacion.compras.cliente import Cliente
        self._values["objeto"] = Cliente
        self._values["valores"] = [Cliente.getIndex()] + [None]*(len(self._values["criterios"]) - len(self._values['habilitado']))
        self._values["atributos"] = ['id', 'nombre', 'fecha_nacimiento', 'direccion', 'telefono']
        self._padre.showFieldFrame(self._values)
    
    def _gestionarComprasProductos(self):
        self._values["criterios"] = ["ID", "Descripcion", "Descuento", "Fecha de compra", "Codigo Cliente", "Codigo Cajero"]
        self._values["habilitado"] = ["ID"]
        self._values["valores"] = [None]* len(self._values["criterios"])
        self._values["nombreProceso"] = "Gestionar Compra-Productos"
        self._values["descripcionProceso"] = "Registra la informacion de una nueva compra de productos en el sistema"
        from gestionAplicacion.compras.compra_productos import CompraProductos
        self._values["objeto"] = CompraProductos
        self._values["atributos"] = ['id', 'descripcion', 'descuento', 'fecha_de_compra', 'codigo_cliente', 'codigo_cajero']
        self._padre.showFieldFrame(self._values)

    def _gestionarCompraServicio(self):
        self._values["criterios"] = ["ID", "Descripcion", "Descuento", "Tiempo de culminación", "Codigo Tipo Servicio"]
        self._values["habilitado"] = ["ID"]
        self._values["valores"] = [None]* len(self._values["criterios"])
        self._values["nombreProceso"] = "Gestionar Compra-Servicios"
        self._values["descripcionProceso"] = "Registra la informacion de una nueva compra de servicios en el sistema"
        from gestionAplicacion.compras.compra_servicios import CompraServicios
        self._values["objeto"] = CompraServicios
        self._values["atributos"] = ['id', 'descripcion', 'descuento', 'tiempo_de_culminacion', 'codigo_tipo_servicio']
        self._padre.showFieldFrame(self._values)
    
    def _gestionarCajeros(self):
        self._values["criterios"] = ["ID", "Nombre", "Sueldo", "Comision", "Correo", "Número de contacto", "Cantidad de ventas"]
        self._values["habilitado"] = ["ID"]
        self._values["valores"] = [None]* len(self._values["criterios"])
        self._values["nombreProceso"] = "Gestionar empleados de cajeros"
        self._values["descripcionProceso"] = "Registra la informacion de un nuevo empleado cajero en el sitema"
        from gestionAplicacion.empleados.cajero import Cajero
        self._values["objeto"] = Cajero
        self._values["atributos"] = ['id', 'nombre', 'sueldo', 'comision', 'correo', 'numeroContacto', 'cantidadEnVentas']
        self._padre.showFieldFrame(self._values)
    
    def _gestionarTecnico(self):
        self._values["criterios"] = ["ID", "Nombre", "Sueldo", "Comision", "Correo", "Número de contacto", "Años de experiencias"]
        self._values["habilitado"] = ["ID"]
        self._values["valores"] = [None]* len(self._values["criterios"])
        self._values["nombreProceso"] = "Gestionar empleados tecnicos"
        self._values["descripcionProceso"] = "Registra la informacion de un nuevos empleado tecnico"
        from gestionAplicacion.empleados.tecnico import Tecnico
        self._values["objeto"] = Tecnico
        self._values["atributos"] = ['id', 'nombre', 'sueldo', 'comision', 'correo', 'numeroContacto', 'experiencia']
        self._padre.showFieldFrame(self._values)
    
    def _gestionarProductos(self):
        self._values["criterios"] = ["ID", "Nombre", "Fecha de Ingreso", "Precio", "Descripción"]
        self._values["habilitado"] = ["ID"]
        self._values["valores"] = [None]* len(self._values["criterios"])
        self._values["nombreProceso"] = "Gestionar Productos"
        self._values["descripcionProceso"] = "Registra la informacion de un nuevo producto"
        from gestionAplicacion.productos.producto import Producto
        self._values["objeto"] = Producto
        self._values["atributos"] = ['id', 'nombre', 'fecha_ingreso', 'precio', 'descripcion']
        self._padre.showFieldFrame(self._values)
    
    def _verClientesValiosos(self):
        self._padre.mostrarFrameFuncionalidades(ClienteValioso)

    def _verDevolucionCompraProductos(self):
        self._padre.mostrarFrameFuncionalidades(Devolucion)

    def _calcularComision(self):
        self._padre.mostrarFrameFuncionalidades(Comision)

    def _generarInforme(self):
        self._padre.mostrarFrameFuncionalidades(Informe)

    def _consultaBaseDeDatos(self):
        self._padre.mostrarFrameFuncionalidades(ConsultaBDD)
