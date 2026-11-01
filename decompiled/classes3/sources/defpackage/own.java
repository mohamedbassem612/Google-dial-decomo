package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class own {
    public final java.lang.String a;
    public final j$.util.Optional b;
    public final j$.util.Optional c;
    public final boolean d;
    public final android.graphics.drawable.Drawable e;
    public final boolean f;
    public final defpackage.abwd g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final defpackage.owy n;
    public final boolean o;
    public final boolean p;

    public own(java.lang.String str, j$.util.Optional optional, j$.util.Optional optional2, boolean z, android.graphics.drawable.Drawable drawable, boolean z2, defpackage.abwd abwdVar, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, defpackage.owy owyVar, boolean z9, boolean z10) {
        this.a = str;
        this.b = optional;
        this.c = optional2;
        this.d = z;
        this.e = drawable;
        this.f = z2;
        this.g = abwdVar;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = z8;
        this.n = owyVar;
        this.o = z9;
        this.p = z10;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.own) {
            defpackage.own ownVar = (defpackage.own) obj;
            if (this.a.equals(ownVar.a) && this.b.equals(ownVar.b) && this.c.equals(ownVar.c) && this.d == ownVar.d && this.e.equals(ownVar.e) && this.f == ownVar.f && this.g.equals(ownVar.g) && this.h == ownVar.h && this.i == ownVar.i && this.j == ownVar.j && this.k == ownVar.k && this.l == ownVar.l && this.m == ownVar.m && this.n.equals(ownVar.n) && this.o == ownVar.o && this.p == ownVar.p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ this.g.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true != this.j ? 1237 : 1231)) * 1000003) ^ (true != this.k ? 1237 : 1231)) * 1000003) ^ (true != this.l ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (true != this.o ? 1237 : 1231)) * 1000003) ^ (true == this.p ? 1231 : 1237);
    }

    public final java.lang.String toString() {
        defpackage.owy owyVar = this.n;
        defpackage.abwd abwdVar = this.g;
        android.graphics.drawable.Drawable drawable = this.e;
        j$.util.Optional optional = this.c;
        return "AnswerMethodModel{callId=" + this.a + ", incomingWillDisconnectApp=" + java.lang.String.valueOf(this.b) + ", incomingWillDisconnectAppLegacy=" + java.lang.String.valueOf(optional) + ", shouldShowAnswerHint=" + this.d + ", answerPuckDrawable=" + java.lang.String.valueOf(drawable) + ", isVideoCall=" + this.f + ", photoInfo=" + java.lang.String.valueOf(abwdVar) + ", isRttCall=" + this.h + ", isVideoUpgradeRequest=" + this.i + ", canUpgradeToRttCall=" + this.j + ", shouldShowAnswerAsRttButton=" + this.k + ", isEmergencyCallback=" + this.l + ", shouldAnswerButtonShowAnswerAndEndHeldCallLabel=" + this.m + ", selectedAnswerMethod=" + java.lang.String.valueOf(owyVar) + ", isSpamCall=" + this.o + ", hasCallBackground=" + this.p + '}';
    }

    public own() {
        throw null;
    }
}
