package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yop {
    public final aify a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final defpackage.yom g;
    public final defpackage.ymm h;

    public yop(aify aifyVar, int i, int i2, int i3, int i4, int i5, defpackage.yom yomVar, defpackage.ymm ymmVar) {
        this.a = aifyVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = yomVar;
        this.h = ymmVar;
    }

    public static defpackage.yoo a(java.util.List list) {
        defpackage.yoo yooVar = new defpackage.yoo();
        yooVar.a = aify.n(list);
        yooVar.d();
        yooVar.e(3);
        yooVar.c();
        yooVar.b();
        yooVar.b = 3;
        byte b = yooVar.f;
        yooVar.c = 123;
        yooVar.f = (byte) (b | 48);
        yooVar.d = new defpackage.yom(aigf.i(new java.util.HashMap()));
        yooVar.f = (byte) (yooVar.f | 64);
        yooVar.e = defpackage.ymm.a;
        return yooVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yop) {
            defpackage.yop yopVar = (defpackage.yop) obj;
            if (ahvr.aP(this.a, yopVar.a) && this.b == yopVar.b && this.c == yopVar.c && this.d == yopVar.d && this.e == yopVar.e && this.f == yopVar.f && this.g.equals(yopVar.g) && this.h.equals(yopVar.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.a.hashCode() ^ 1000003) * 583896283) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d) * 583896283) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode()) * (-721379959)) ^ 1001110;
    }

    public final java.lang.String toString() {
        defpackage.ymm ymmVar = this.h;
        defpackage.yom yomVar = this.g;
        return "SummarizationRequest{messages=" + java.lang.String.valueOf(this.a) + ", batchMessages=null, temperature=0.0, topK=" + this.b + ", targetReplyLengthMin=" + this.c + ", targetReplyLengthMax=" + this.d + ", streamingCallback=null, taskStateChangeCallback=null, bulletPointNum=" + this.e + ", rngSeed=" + this.f + ", promptArguments=" + java.lang.String.valueOf(yomVar) + ", overrideRequestKind=0, userProperties=" + java.lang.String.valueOf(ymmVar) + '}';
    }

    public yop() {
        throw null;
    }
}
