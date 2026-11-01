package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aik implements defpackage.cer {
    public final defpackage.aoss a;
    public defpackage.aii b;
    public defpackage.aiq c;
    public defpackage.aoub d;
    private final defpackage.ccp e = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);

    public aik(java.lang.Object obj, defpackage.nf nfVar, defpackage.aiq aiqVar, java.lang.Object obj2, java.lang.String str, defpackage.aoss aossVar) {
        this.a = aossVar;
        this.b = new defpackage.aii(obj, nfVar, obj2, str);
        this.c = b(aiqVar, obj2);
    }

    public static final defpackage.aiq b(defpackage.aiq aiqVar, java.lang.Object obj) {
        if (obj == null || !(aiqVar instanceof defpackage.aku)) {
            return aiqVar;
        }
        defpackage.aku akuVar = (defpackage.aku) aiqVar;
        return !defpackage.aooh.n(akuVar.c, obj) ? new defpackage.aku(akuVar.a, akuVar.b, obj) : aiqVar;
    }

    @Override // defpackage.cer
    public final java.lang.Object a() {
        java.lang.Object objA;
        defpackage.cer cerVar = (defpackage.cer) this.e.a();
        return (cerVar == null || (objA = cerVar.a()) == null) ? this.b.d() : objA;
    }
}
