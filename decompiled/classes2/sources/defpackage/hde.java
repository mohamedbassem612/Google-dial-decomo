package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hde implements defpackage.hdl {
    public final java.util.List a;

    public hde(java.util.List list) {
        this.a = list;
    }

    @Override // defpackage.hdl
    public final defpackage.hbd a() {
        java.util.List list = this.a;
        return ((defpackage.hgn) list.get(0)).f() ? new defpackage.hbn(list) : new defpackage.hbm(list);
    }

    @Override // defpackage.hdl
    public final java.util.List b() {
        return this.a;
    }

    @Override // defpackage.hdl
    public final boolean c() {
        java.util.List list = this.a;
        return list.size() == 1 && ((defpackage.hgn) list.get(0)).f();
    }
}
