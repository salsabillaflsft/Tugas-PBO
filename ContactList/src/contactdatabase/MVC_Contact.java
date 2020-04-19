package contactdatabase;

public class MVC_Contact {
    ViewContact viewcontact = new ViewContact();
    ModelContact modelcontact = new ModelContact();
    ControllerContact controllercontact = new ControllerContact(modelcontact,viewcontact);
}
