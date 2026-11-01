package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeqr {
    public final java.lang.String a;
    public final boolean b;
    public final defpackage.apgu c;
    public final defpackage.apev d;
    public final java.lang.String e;
    public final defpackage.aevn f;
    public final boolean g;
    public final aerz h;
    public final boolean i;
    public final int j;
    public final java.util.function.Predicate k;
    public final aeox l;
    public final int m;
    public final int n;

    public aeqr(java.lang.String str, boolean z, defpackage.apgu apguVar, defpackage.apev apevVar, java.lang.String str2, defpackage.aevn aevnVar, boolean z2, int i, aerz aerzVar, boolean z3, int i2, java.util.function.Predicate predicate, aeox aeoxVar, int i3) {
        this.a = str;
        this.b = z;
        this.c = apguVar;
        this.d = apevVar;
        this.e = str2;
        this.f = aevnVar;
        this.g = z2;
        this.n = i;
        this.h = aerzVar;
        this.i = z3;
        this.j = i2;
        this.k = predicate;
        this.l = aeoxVar;
        this.m = i3;
    }

    public static defpackage.aeqq a() {
        defpackage.aeqq aeqqVar = new defpackage.aeqq();
        aeqqVar.c(false);
        aeqqVar.d(false);
        aeqqVar.b(0);
        aeqqVar.g(false);
        aeqqVar.e(Integer.MAX_VALUE);
        aeqqVar.f = new defpackage.opv(12);
        return aeqqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.apev apevVar;
        java.lang.String str;
        defpackage.aevn aevnVar;
        int i;
        aeox aeoxVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.aeqr) {
            defpackage.aeqr aeqrVar = (defpackage.aeqr) obj;
            java.lang.String str2 = this.a;
            if (str2 != null ? str2.equals(aeqrVar.a) : aeqrVar.a == null) {
                if (this.b == aeqrVar.b && this.c.equals(aeqrVar.c) && ((apevVar = this.d) != null ? apevVar.equals(aeqrVar.d) : aeqrVar.d == null) && ((str = this.e) != null ? str.equals(aeqrVar.e) : aeqrVar.e == null) && ((aevnVar = this.f) != null ? aevnVar.equals(aeqrVar.f) : aeqrVar.f == null) && this.g == aeqrVar.g && ((i = this.n) != 0 ? i == aeqrVar.n : aeqrVar.n == 0)) {
                    if (this.h != null) {
                        aerz aerzVar = aeqrVar.h;
                        throw null;
                    }
                    if (aeqrVar.h == null && this.i == aeqrVar.i && this.j == aeqrVar.j && aa$.ExternalSyntheticApiModelOutline1.m(this.k, aeqrVar.k) && ((aeoxVar = this.l) != null ? aeoxVar.equals(aeqrVar.l) : aeqrVar.l == null) && this.m == aeqrVar.m) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        java.lang.String str = this.a;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.c.hashCode();
        defpackage.apev apevVar = this.d;
        int iHashCode2 = ((iHashCode * 1000003) ^ (apevVar == null ? 0 : apevVar.hashCode())) * 1000003;
        java.lang.String str2 = this.e;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        defpackage.aevn aevnVar = this.f;
        int iHashCode4 = (((iHashCode3 ^ (aevnVar == null ? 0 : aevnVar.hashCode())) * 1000003) ^ (true != this.g ? 1237 : 1231)) * 1000003;
        int i = this.n;
        if (i == 0) {
            i = 0;
        }
        int i2 = iHashCode4 ^ i;
        if (this.h != null) {
            throw null;
        }
        int iM = ((((((i2 * (-721379959)) ^ (true == this.i ? 1231 : 1237)) * 1000003) ^ this.j) * 1000003) ^ aa$.ExternalSyntheticApiModelOutline1.m(this.k)) * 1000003;
        aeox aeoxVar = this.l;
        return ((iM ^ (aeoxVar != null ? aeoxVar.hashCode() : 0)) * 1000003) ^ this.m;
    }

    public final java.lang.String toString() {
        int i = this.n;
        java.lang.String strValueOf = java.lang.String.valueOf(this.c);
        java.lang.String strValueOf2 = java.lang.String.valueOf(this.d);
        java.lang.String strValueOf3 = java.lang.String.valueOf(this.f);
        java.lang.String string = i != 0 ? java.lang.Integer.toString(i - 1) : "null";
        aerz aerzVar = this.h;
        java.util.function.Predicate predicate = this.k;
        aeox aeoxVar = this.l;
        return "Metric{customEventName=" + this.a + ", isEventNameConstant=" + this.b + ", metric=" + strValueOf + ", metricExtension=" + strValueOf2 + ", accountableComponentName=" + this.e + ", samplingRate=" + strValueOf3 + ", isUnsampled=" + this.g + ", samplingStrategy=" + string + ", activeCuiId=" + java.lang.String.valueOf(aerzVar) + ", shouldAttachActiveTraces=" + this.i + ", maxActiveTraces=" + this.j + ", activeTracePredicate=" + java.lang.String.valueOf(predicate) + ", debugLogsTime=" + java.lang.String.valueOf(aeoxVar) + ", debugLogsSize=" + this.m + '}';
    }

    public aeqr() {
        throw null;
    }
}
