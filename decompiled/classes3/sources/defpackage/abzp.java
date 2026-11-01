package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class abzp extends anty {
    public final java.lang.Object a;
    public defpackage.abzo b;
    public boolean c;
    public final defpackage.aeto d;

    public abzp(defpackage.aeto aetoVar) {
        super((byte[]) null, (byte[]) null, (byte[]) null);
        this.a = new java.lang.Object();
        this.c = false;
        this.d = aetoVar;
        if (ahvr.cp("application/grpc")) {
            return;
        }
        aetoVar.k = "application/grpc";
    }

    public final anmg b() {
        anmg anmgVar;
        synchronized (this.a) {
            if (this.b != null) {
                anmgVar = new anmg(this);
            } else {
                defpackage.abzo abzoVar = new defpackage.abzo(this.d);
                this.b = abzoVar;
                anmgVar = abzoVar;
            }
        }
        return anmgVar;
    }
}
