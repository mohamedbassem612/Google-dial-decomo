package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aorv implements defpackage.aosa {
    private final defpackage.aoru[] a;

    public aorv(defpackage.aoru[] aoruVarArr) {
        this.a = aoruVarArr;
    }

    public final void a() {
        int i = 0;
        while (true) {
            defpackage.aoru[] aoruVarArr = this.a;
            if (i >= aoruVarArr.length) {
                return;
            }
            defpackage.aotj aotjVar = aoruVarArr[i].a;
            if (aotjVar == null) {
                defpackage.aooh.j("handle");
                aotjVar = null;
            }
            aotjVar.fz();
            i++;
        }
    }

    @Override // defpackage.aosa
    public final void b(java.lang.Throwable th) {
        a();
    }

    public final java.lang.String toString() {
        return "DisposeHandlersOnCancel[" + this.a + ']';
    }
}
