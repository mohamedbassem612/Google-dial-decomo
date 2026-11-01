package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class fen {
    public final java.lang.String a;
    public final boolean b;
    public final boolean c;

    public fen(java.lang.String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == defpackage.fen.class) {
            defpackage.fen fenVar = (defpackage.fen) obj;
            if (android.text.TextUtils.equals(this.a, fenVar.a) && this.b == fenVar.b && this.c == fenVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 31) * 31) + (true != this.b ? 1237 : 1231)) * 31) + (true == this.c ? 1231 : 1237);
    }
}
