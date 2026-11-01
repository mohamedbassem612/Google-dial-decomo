package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gnm extends defpackage.gow {
    public final java.util.Set a;
    public final boolean b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gnm(java.util.Set set) {
        super(null);
        if (set == null) {
            defpackage.aooh.i("filters");
        }
        this.a = set;
        this.b = true;
    }

    @Override // defpackage.gow
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof defpackage.gnm) && super.equals(obj)) {
            defpackage.gnm gnmVar = (defpackage.gnm) obj;
            if (defpackage.aooh.n(this.a, gnmVar.a)) {
                boolean z = gnmVar.b;
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.gow
    public final int hashCode() {
        return (((super.hashCode() * 31) + this.a.hashCode()) * 31) + 1231;
    }

    public final java.lang.String toString() {
        return "ActivityRule:{tag={" + a() + "},filters={" + this.a + "}, alwaysExpand={true}}";
    }
}
