package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ajt implements cer {
    public java.lang.Object a;
    public java.lang.Object b;
    public aiq c;
    public defpackage.ala d;
    public boolean e;
    public boolean f;
    public long g;
    final /* synthetic */ defpackage.ajw h;
    public final nf i;
    private final ccp j;

    public ajt(defpackage.ajw ajwVar, java.lang.Object obj, java.lang.Object obj2, nf nfVar, aiq aiqVar) {
        this.h = ajwVar;
        this.a = obj;
        this.b = obj2;
        this.i = nfVar;
        this.j = new androidx.compose.runtime.ParcelableSnapshotMutableState(obj, cdu.c);
        this.c = aiqVar;
        this.d = new defpackage.ala(this.c, nfVar, this.a, this.b, null);
    }

    public final java.lang.Object a() {
        return this.j.a();
    }

    public final void b(java.lang.Object obj) {
        this.j.b(obj);
    }
}
