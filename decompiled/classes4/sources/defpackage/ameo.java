package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ameo {
    public final java.lang.String a;
    public final aify b;
    public final aify c;
    public final boolean d;

    public ameo(java.lang.String str, aify aifyVar, aify aifyVar2, boolean z) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null text");
        }
        this.a = str;
        if (aifyVar == null) {
            throw new java.lang.NullPointerException("Null timingHints");
        }
        this.b = aifyVar;
        if (aifyVar2 == null) {
            throw new java.lang.NullPointerException("Null lowConfidenceSpans");
        }
        this.c = aifyVar2;
        this.d = z;
    }

    public final defpackage.ameo a(defpackage.amce amceVar) {
        java.lang.Integer num = amceVar.c;
        if (num.intValue() == 0) {
            return this;
        }
        java.lang.String strSubstring = num.intValue() == 0 ? "" : amceVar.d().substring(0, num.intValue());
        if (strSubstring.isEmpty()) {
            return this;
        }
        java.lang.String strValueOf = java.lang.String.valueOf(strSubstring);
        j$.util.stream.Stream stream = j$.util.Collection.-EL.stream(this.c);
        java.lang.String strConcat = strValueOf.concat(" ");
        aify aifyVar = (aify) stream.map(new defpackage.amcr(strConcat, 12)).collect(aido.a);
        java.lang.String str = this.a;
        return new defpackage.ameo(strConcat.concat(str), aike.a, aifyVar, this.d);
    }

    public final defpackage.ameo b(aify aifyVar) {
        j$.util.Optional optionalOf;
        if (aifyVar.isEmpty()) {
            return this;
        }
        java.lang.String str = this.a;
        if (str.isEmpty()) {
            return this;
        }
        java.lang.String strO = defpackage.amev.o(aifyVar);
        int iIntValue = 0;
        if (!strO.isEmpty()) {
            j$.util.Optional optionalJ = defpackage.amev.j(strO, str, true);
            if (optionalJ.isEmpty()) {
                optionalOf = j$.util.Optional.empty();
            } else {
                java.lang.String str2 = (java.lang.String) optionalJ.get();
                if (str2.length() == str.length()) {
                    optionalOf = j$.util.Optional.of(java.lang.Integer.valueOf(str.length()));
                } else {
                    int iIndexOf = str.indexOf(str2) + str2.length();
                    if (iIndexOf < str.length()) {
                        iIndexOf++;
                    }
                    optionalOf = j$.util.Optional.of(java.lang.Integer.valueOf(iIndexOf));
                }
            }
            iIntValue = ((java.lang.Integer) optionalOf.orElse(0)).intValue();
        }
        return c(iIntValue);
    }

    public final defpackage.ameo c(int i) {
        return new defpackage.ameo(this.a.substring(i), aike.a, (aify) j$.util.Collection.-EL.stream(this.c).map(new defpackage.exw(i, 12)).filter(new defpackage.amdm(2)).map(new defpackage.amdk(16)).map(new defpackage.exw(i, 13)).collect(aido.a), this.d);
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ameo) {
            defpackage.ameo ameoVar = (defpackage.ameo) obj;
            if (this.a.equals(ameoVar.a) && ahvr.aP(this.b, ameoVar.b) && ahvr.aP(this.c, ameoVar.c) && this.d == ameoVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        aify aifyVar = this.c;
        return "TranscriptionResult{text=" + this.a + ", timingHints=" + this.b.toString() + ", lowConfidenceSpans=" + aifyVar.toString() + ", isFinal=" + this.d + '}';
    }

    public ameo() {
        throw null;
    }
}
