package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pac {
    public final aify a;
    public final java.lang.String b;
    public final j$.util.Optional c;
    public final j$.util.Optional d;
    public final defpackage.pab e;
    public final boolean f;
    public final boolean g;
    public final jxs h;
    public final boolean i;
    public final boolean j;
    public final defpackage.pom k;
    public final j$.util.Optional l;
    private final boolean m;

    public pac(aify aifyVar, java.lang.String str, j$.util.Optional optional, j$.util.Optional optional2, defpackage.pab pabVar, boolean z, boolean z2, boolean z3, jxs jxsVar, boolean z4, boolean z5, defpackage.pom pomVar, j$.util.Optional optional3) {
        this.a = aifyVar;
        this.b = str;
        this.c = optional;
        this.d = optional2;
        this.e = pabVar;
        this.f = z;
        this.m = z2;
        this.g = z3;
        this.h = jxsVar;
        this.i = z4;
        this.j = z5;
        this.k = pomVar;
        this.l = optional3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.pac) {
            defpackage.pac pacVar = (defpackage.pac) obj;
            if (ahvr.aP(this.a, pacVar.a) && this.b.equals(pacVar.b) && this.c.equals(pacVar.c) && this.d.equals(pacVar.d) && this.e.equals(pacVar.e) && this.f == pacVar.f && this.m == pacVar.m && this.g == pacVar.g && this.h.equals(pacVar.h) && this.i == pacVar.i && this.j == pacVar.j && this.k.equals(pacVar.k) && this.l.equals(pacVar.l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (true != this.f ? 1237 : 1231)) * 1000003) ^ (true != this.m ? 1237 : 1231)) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (true != this.i ? 1237 : 1231)) * 1000003) ^ (true == this.j ? 1231 : 1237)) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode();
    }

    public final java.lang.String toString() {
        j$.util.Optional optional = this.l;
        defpackage.pom pomVar = this.k;
        jxs jxsVar = this.h;
        defpackage.pab pabVar = this.e;
        j$.util.Optional optional2 = this.d;
        j$.util.Optional optional3 = this.c;
        return "AnswerModel{chips=" + java.lang.String.valueOf(this.a) + ", callId=" + this.b + ", selectedCenterFragmentKey=" + java.lang.String.valueOf(optional3) + ", selectedFeatureIndicatorLabel=" + java.lang.String.valueOf(optional2) + ", statusBarTheme=" + java.lang.String.valueOf(pabVar) + ", shouldSuppressFullscreenAlert=" + this.f + ", isSpamCall=" + this.m + ", shouldShowBlackOverlay=" + this.g + ", locationModel=" + java.lang.String.valueOf(jxsVar) + ", isEmergencyCallback=" + this.i + ", isCallWithAdditionalUiElements=" + this.j + ", contactGridDataModel=" + java.lang.String.valueOf(pomVar) + ", callBackground=" + java.lang.String.valueOf(optional) + '}';
    }

    public pac() {
        throw null;
    }
}
