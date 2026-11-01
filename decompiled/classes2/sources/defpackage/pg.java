package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class pg {
    public final int a;
    public final java.lang.String b;
    private final java.lang.Object c;

    public pg(int i, java.lang.Object obj, java.lang.String str) {
        this.a = i;
        this.c = obj;
        this.b = str;
    }

    public final java.lang.Object a() {
        if (b()) {
            return this.c;
        }
        toString();
        throw new java.lang.IllegalStateException("AppSearchResult is a failure: ".concat(toString()));
    }

    public final boolean b() {
        return this.a == 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.pg) {
            defpackage.pg pgVar = (defpackage.pg) obj;
            if (this.a == pgVar.a && j$.util.Objects.equals(this.c, pgVar.c) && j$.util.Objects.equals(this.b, pgVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(this.a), this.c, this.b});
    }

    public final java.lang.String toString() {
        if (b()) {
            java.lang.Object obj = this.c;
            java.util.Objects.toString(obj);
            return "[SUCCESS]: ".concat(java.lang.String.valueOf(obj));
        }
        return "[FAILURE(" + this.a + ")]: " + this.b;
    }
}
