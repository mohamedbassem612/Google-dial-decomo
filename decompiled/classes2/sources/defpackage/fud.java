package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fud {
    public final defpackage.fmk a;
    public final byte[] c;
    public int d;
    public long e;
    public boolean f;
    public long g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;
    public final boolean b = false;
    private final android.util.SparseArray n = new android.util.SparseArray();
    private final android.util.SparseArray o = new android.util.SparseArray();
    public final defpackage.fsu m = new defpackage.fsu();

    public fud(defpackage.fmk fmkVar) {
        this.a = fmkVar;
        byte[] bArr = new byte[128];
        this.c = bArr;
        new defpackage.evf(bArr, 0, 0);
        b();
    }

    public final void a(defpackage.evb evbVar) {
        this.n.append(evbVar.d, evbVar);
    }

    public final void b() {
        this.f = false;
        this.h = false;
    }

    public final void c(absu absuVar) {
        this.o.append(absuVar.a, absuVar);
    }
}
