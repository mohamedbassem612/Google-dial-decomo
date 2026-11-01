package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fgq {
    public long a;
    public long b;
    public defpackage.fgq c;
    public amwp d;

    public fgq(long j) {
        d(j);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.d.a;
        return (int) j2;
    }

    public final defpackage.fgq b() {
        this.d = null;
        defpackage.fgq fgqVar = this.c;
        this.c = null;
        return fgqVar;
    }

    public final defpackage.fgq c() {
        defpackage.fgq fgqVar = this.c;
        if (fgqVar == null || fgqVar.d == null) {
            return null;
        }
        return fgqVar;
    }

    public final void d(long j) {
        ahvr.bY(this.d == null);
        this.a = j;
        this.b = j + 65536;
    }

    public final amwp e() {
        amwp amwpVar = this.d;
        ahvr.ci(amwpVar);
        return amwpVar;
    }
}
