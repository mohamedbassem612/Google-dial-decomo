package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xxo {
    final java.lang.Object a;
    public java.util.List b;
    defpackage.xxo c;
    defpackage.xxo d;

    public xxo(java.lang.Object obj) {
        this.d = this;
        this.c = this;
        this.a = obj;
    }

    public final int a() {
        java.util.List list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public final java.lang.Object b() {
        int iA = a();
        if (iA > 0) {
            return this.b.remove(iA - 1);
        }
        return null;
    }

    xxo() {
        throw null;
    }
}
