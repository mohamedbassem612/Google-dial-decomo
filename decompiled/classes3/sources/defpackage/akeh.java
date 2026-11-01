package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akeh extends defpackage.akec {
    public final java.lang.Object a;

    public akeh(java.lang.Boolean bool) {
        this.a = j$.util.Objects.requireNonNull(bool);
    }

    private static int k(double d) {
        long j = (long) d;
        return d == ((double) j) ? anty.M(j) : anty.aB(d);
    }

    private static boolean l(defpackage.akeh akehVar) {
        java.lang.Object obj = akehVar.a;
        if (!(obj instanceof java.lang.Number)) {
            return false;
        }
        java.lang.Number number = (java.lang.Number) obj;
        return (number instanceof java.math.BigInteger) || (number instanceof java.lang.Long) || (number instanceof java.lang.Integer) || (number instanceof java.lang.Short) || (number instanceof java.lang.Byte);
    }

    @Override // defpackage.akec
    public final java.lang.String a() {
        java.lang.Object obj = this.a;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        if (j()) {
            return c().toString();
        }
        if (i()) {
            return ((java.lang.Boolean) obj).toString();
        }
        throw new java.lang.AssertionError("Unexpected value type: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(obj.getClass()))));
    }

    public final double b() {
        return j() ? c().doubleValue() : java.lang.Double.parseDouble(a());
    }

    public final java.lang.Number c() {
        java.lang.Object obj = this.a;
        if (obj instanceof java.lang.Number) {
            return (java.lang.Number) obj;
        }
        if (obj instanceof java.lang.String) {
            return new defpackage.akek((java.lang.String) obj);
        }
        throw new java.lang.UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            defpackage.akeh akehVar = (defpackage.akeh) obj;
            java.lang.Object obj2 = this.a;
            if (obj2 == null) {
                if (akehVar.a == null) {
                    return true;
                }
            } else {
                if (!l(this) || !l(akehVar)) {
                    if (obj2 instanceof java.lang.Number) {
                        java.lang.Object obj3 = akehVar.a;
                        if (obj3 instanceof java.lang.Number) {
                            if (!(obj2 instanceof java.math.BigDecimal) || !(obj3 instanceof java.math.BigDecimal)) {
                                double dB = b();
                                double dB2 = akehVar.b();
                                if (dB == dB2) {
                                    return true;
                                }
                                if (java.lang.Double.isNaN(dB) && java.lang.Double.isNaN(dB2)) {
                                    return true;
                                }
                            } else if (g().compareTo(akehVar.g()) == 0) {
                                return true;
                            }
                        }
                    }
                    return obj2.equals(akehVar.a);
                }
                if ((obj2 instanceof java.math.BigInteger) || (akehVar.a instanceof java.math.BigInteger)) {
                    return h().equals(akehVar.h());
                }
                if (c().longValue() == akehVar.c().longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.math.BigDecimal g() {
        java.lang.Object obj = this.a;
        return obj instanceof java.math.BigDecimal ? (java.math.BigDecimal) obj : defpackage.agwm.k(a());
    }

    public final java.math.BigInteger h() {
        java.lang.Object obj = this.a;
        if (obj instanceof java.math.BigInteger) {
            return (java.math.BigInteger) obj;
        }
        if (l(this)) {
            return java.math.BigInteger.valueOf(c().longValue());
        }
        java.lang.String strA = a();
        defpackage.agwm.l(strA);
        return new java.math.BigInteger(strA);
    }

    public final int hashCode() {
        java.lang.Object obj = this.a;
        if (obj == null) {
            return 31;
        }
        if (l(this)) {
            return k(c().doubleValue());
        }
        return obj instanceof java.lang.Number ? k(c().doubleValue()) : obj.hashCode();
    }

    public final boolean i() {
        return this.a instanceof java.lang.Boolean;
    }

    public final boolean j() {
        return this.a instanceof java.lang.Number;
    }

    public akeh(java.lang.Number number) {
        this.a = j$.util.Objects.requireNonNull(number);
    }

    public akeh(java.lang.String str) {
        this.a = j$.util.Objects.requireNonNull(str);
    }
}
