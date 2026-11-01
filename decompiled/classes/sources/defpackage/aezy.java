package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aezy implements defpackage.ahzi {
    boolean a;
    java.lang.Object b;
    final /* synthetic */ defpackage.ahzi c;

    public aezy(defpackage.ahzi ahziVar) {
        this.c = ahziVar;
    }

    @Override // defpackage.ahzi
    public final java.lang.Object eZ() {
        if (this.a) {
            return this.b;
        }
        java.lang.Object objEZ = this.c.eZ();
        this.b = objEZ;
        this.a = true;
        return objEZ;
    }
}
