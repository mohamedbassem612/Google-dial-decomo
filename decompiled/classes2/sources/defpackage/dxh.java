package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class dxh {
    final java.lang.String a;
    final java.lang.String b;
    final java.util.List c;

    public dxh(java.lang.String str, java.lang.String str2, java.util.List list) {
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dxh) {
            defpackage.dxh dxhVar = (defpackage.dxh) obj;
            if (j$.util.Objects.equals(this.a, dxhVar.a) && j$.util.Objects.equals(this.b, dxhVar.b) && j$.util.Objects.equals(this.c, dxhVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.a, this.b, this.c});
    }
}
