package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ynl {
    public final java.lang.String a;
    private final float b;
    private final int c;
    private final defpackage.yni d;
    private final aify e;

    public ynl(java.lang.String str, float f, int i, defpackage.yni yniVar, aify aifyVar) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
        this.b = f;
        this.c = i;
        this.d = yniVar;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null functionCalls");
        }
        this.e = aifyVar;
    }

    public static defpackage.ynl a(java.lang.String str, float f, int i, defpackage.yni yniVar, java.util.List list) {
        return new defpackage.ynl(str, f, i, yniVar, list == null ? aike.a : aify.n(list));
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.yni yniVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ynl) {
            defpackage.ynl ynlVar = (defpackage.ynl) obj;
            if (this.a.equals(ynlVar.a)) {
                if (java.lang.Float.floatToIntBits(this.b) == java.lang.Float.floatToIntBits(ynlVar.b) && this.c == ynlVar.c && ((yniVar = this.d) != null ? yniVar.equals(ynlVar.d) : ynlVar.d == null) && ahvr.aP(this.e, ynlVar.e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((this.a.hashCode() ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.b);
        defpackage.yni yniVar = this.d;
        return (((((iHashCode * 1000003) ^ this.c) * 1000003) ^ (yniVar == null ? 0 : yniVar.hashCode())) * 1000003) ^ this.e.hashCode();
    }

    public final java.lang.String toString() {
        aify aifyVar = this.e;
        return "LlmReply{text=" + this.a + ", score=" + this.b + ", stopReason=" + this.c + ", citationMetadata=" + java.lang.String.valueOf(this.d) + ", functionCalls=" + aifyVar.toString() + '}';
    }

    public ynl() {
        throw null;
    }
}
