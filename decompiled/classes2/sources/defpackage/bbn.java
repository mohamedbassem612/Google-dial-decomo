package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bbn implements bdm {
    private final defpackage.bcl a;

    public bbn(defpackage.bcl bclVar) {
        this.a = bclVar;
    }

    public final int a() {
        return this.a.b();
    }

    public final int b() {
        return this.a.i().n;
    }

    public final int c() {
        java.util.List list = this.a.i().l;
        if (list.isEmpty()) {
            throw new java.util.NoSuchElementException("List is empty.");
        }
        return ((defpackage.bcc) list.get(list.size() - 1)).a;
    }

    public final int d() {
        int i;
        defpackage.bcl bclVar = this.a;
        if (bclVar.i().l.isEmpty()) {
            return 0;
        }
        int iBw = mni.bw(bclVar.i());
        int iD = wi.d(bclVar.i());
        if (iD == 0 || (i = iBw / iD) <= 0) {
            return 1;
        }
        return i;
    }

    public final boolean e() {
        return !this.a.i().l.isEmpty();
    }
}
