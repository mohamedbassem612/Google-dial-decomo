package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vil extends defpackage.vij {
    public final boolean c;
    private final java.lang.String d;

    public vil(java.lang.String str, boolean z) {
        this.d = str;
        this.c = z;
    }

    public final defpackage.viq n() {
        return !q() ? defpackage.viq.c : h(1).j(0);
    }

    public final defpackage.viq o() {
        if (q()) {
            return j(true == f(1).s() ? 2 : 1);
        }
        return defpackage.viq.c;
    }

    public final boolean p(int i, java.lang.String str) {
        return !r() && j(i).e(str);
    }

    public final boolean q() {
        java.lang.String strB = j(0).b();
        return "OK".equalsIgnoreCase(strB) || "NO".equalsIgnoreCase(strB) || "BAD".equalsIgnoreCase(strB) || "PREAUTH".equalsIgnoreCase(strB) || "BYE".equalsIgnoreCase(strB);
    }

    public final boolean r() {
        return this.d != null;
    }

    @Override // defpackage.vij
    public final java.lang.String toString() {
        java.lang.String string = super.toString();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("#");
        sb.append(true != this.c ? this.d : "+");
        sb.append("# ");
        sb.append(string);
        return sb.toString();
    }
}
