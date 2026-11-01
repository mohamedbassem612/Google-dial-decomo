package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public abstract class hdm implements defpackage.hdl {
    public final java.util.List a;

    public hdm(java.util.List list) {
        this.a = list;
    }

    @Override // defpackage.hdl
    public final java.util.List b() {
        return this.a;
    }

    @Override // defpackage.hdl
    public final boolean c() {
        java.util.List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        return list.size() == 1 && ((defpackage.hgn) list.get(0)).f();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.List list = this.a;
        if (!list.isEmpty()) {
            sb.append("values=");
            sb.append(java.util.Arrays.toString(list.toArray()));
        }
        return sb.toString();
    }
}
