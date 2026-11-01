package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jms {
    public final int a;
    public final java.util.List b;
    public final int c;
    public final java.util.Map d;
    public final java.lang.String e;
    private final java.lang.String f;

    public jms(int i, java.util.List list, int i2, java.util.Map map, java.lang.String str, java.lang.String str2) {
        aooh.f(list, "selectorResIds");
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = map;
        this.e = str;
        this.f = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.jms) {
            defpackage.jms jmsVar = (defpackage.jms) obj;
            if (this.a == jmsVar.a && aooh.n(this.b, jmsVar.b) && this.c == jmsVar.c && aooh.n(this.d, jmsVar.d) && aooh.n(this.e, jmsVar.e) && aooh.n(this.f, jmsVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((this.a * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final java.lang.String toString() {
        return "ScamSelector(titleResId=" + this.a + ", selectorResIds=" + this.b + ", progressIndicator=" + this.c + ", impressionMap=" + this.d + ", checkedChipsKey=" + this.e + ", customChipKey=" + this.f + ')';
    }
}
