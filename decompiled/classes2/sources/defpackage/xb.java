package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class xb {
    public boolean a;
    public androidx.car.app.model.ItemList b;
    public androidx.car.app.model.CarText c;
    public androidx.car.app.model.Action d;
    public androidx.car.app.model.ActionStrip e;
    public final java.util.List f = new java.util.ArrayList();
    public int g = 1;
    public final int h = 1;
    public androidx.car.app.model.Header i;

    public final androidx.car.app.model.GridTemplate a() {
        androidx.car.app.model.ItemList itemList = this.b;
        if (this.a == (itemList != null)) {
            throw new java.lang.IllegalStateException("Template is in a loading state but lists are added, or vice versa");
        }
        if (itemList != null) {
            java.util.Iterator it = itemList.getItems().iterator();
            while (it.hasNext()) {
                if (!(((defpackage.xh) it.next()) instanceof androidx.car.app.model.GridItem)) {
                    throw new java.lang.IllegalArgumentException("All the items in grid template's item list must be grid items");
                }
            }
        }
        return new androidx.car.app.model.GridTemplate(this);
    }
}
