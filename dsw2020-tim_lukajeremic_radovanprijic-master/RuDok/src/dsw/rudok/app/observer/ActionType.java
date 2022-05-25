package dsw.rudok.app.observer;

public enum ActionType { //sluze da mogli da prosledimo koji se update desava subscriberima
    //Promene nad elementima repozitorijuma
    PROJECT_RENAMING,
    DOCUMENT_ADDITION, DOCUMENT_REMOVAL, DOCUMENT_RENAMING,
    PAGE_ADDITION, PAGE_REMOVAL, PAGE_RENAMING,
    SLOT_ADDITION, SLOT_REMOVAL, SLOT_MODIFICATION,

    //Greske koje imamo definisane i u ErrorHandler-u
    NO_NODE_SELECTED_ERROR, WORKSPACE_DELETION_ERROR,
    NO_FRAME_SELECTED_ERROR, NO_SHAPE_SELECTED_ERROR, NO_CLICK_ON_SHAPE_ERROR, NO_FRAME_CREATED_ERROR,
    NO_DOUMENT_SELECTED_ERROR, NO_PROJECT_SELECTED_ERROR,
    NO_UNDO_REMAINING_ERROR, NO_REDO_REMAINING_ERROR

}