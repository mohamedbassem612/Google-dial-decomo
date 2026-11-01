package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hha {
    public androidx.car.app.model.Header a;
    public androidx.car.app.model.CarIcon b;
    public androidx.car.app.model.CarText c;
    public final java.util.List d = new java.util.ArrayList();
    public final java.util.List e = new java.util.ArrayList();
    public boolean f;

    public final com.android.car.libraries.apphost.external.model.InCallTemplate a() {
        androidx.car.app.model.Action startHeaderAction;
        boolean z = true;
        if (this.d.isEmpty() && this.e.isEmpty() && this.b == null && this.c == null) {
            z = false;
        }
        if (z == this.f) {
            throw new java.lang.IllegalStateException("Template is in a loading state and content is set or vice versa");
        }
        androidx.car.app.model.Header header = this.a;
        if (header != null && (startHeaderAction = header.getStartHeaderAction()) != null) {
            com.android.car.libraries.apphost.external.model.InCallTemplate.HEADER_ACTION_CONSTRAINT.a(java.util.Collections.singletonList(startHeaderAction));
        }
        return new com.android.car.libraries.apphost.external.model.InCallTemplate(this, null);
    }

    public final void b(androidx.car.app.model.Action action) {
        androidx.car.app.model.Action action2 = (androidx.car.app.model.Action) j$.util.Objects.requireNonNull(action);
        java.util.List list = this.e;
        list.add(action2);
        com.android.car.libraries.apphost.external.model.InCallTemplate.ACTIONS_CONSTRAINT.a(list);
    }

    public final void c(java.lang.CharSequence charSequence) {
        java.util.List list = this.d;
        androidx.car.app.model.CarText carTextCreate = androidx.car.app.model.CarText.create(charSequence);
        if (list.size() >= 2) {
            throw new java.lang.IllegalStateException("A maximum of two texts can be added.");
        }
        list.add(carTextCreate);
    }
}
