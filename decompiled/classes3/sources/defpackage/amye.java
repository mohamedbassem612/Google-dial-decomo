package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amye implements amyp {
    private final android.app.Service a;
    private java.lang.Object b;

    public amye(android.app.Service service) {
        this.a = service;
    }

    public final java.lang.Object B() {
        if (this.b == null) {
            android.app.Service service = this.a;
            android.app.Application application = service.getApplication();
            ajsz.dA(application instanceof amyp, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", new java.lang.Object[]{application.getClass()});
            hjx hjxVarJx = ((amyd) aooc.ar(application, amyd.class)).jx();
            hjxVarJx.a = service;
            aooc.an(hjxVarJx.a, android.app.Service.class);
            this.b = new hkq((him) hjxVarJx.b, (android.app.Service) hjxVarJx.a);
        }
        return this.b;
    }
}
