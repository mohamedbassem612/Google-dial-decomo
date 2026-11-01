package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akeu extends defpackage.agwm {
    public static final defpackage.akeu a = new defpackage.akeu();

    public static final defpackage.akec y(akex akexVar, int i) {
        defpackage.akeh akehVar;
        int i2 = i - 1;
        if (i2 == 5) {
            akehVar = new defpackage.akeh(akexVar.k());
        } else if (i2 == 6) {
            akehVar = new defpackage.akeh(new defpackage.akek(akexVar.k()));
        } else {
            if (i2 != 7) {
                if (i2 != 8) {
                    throw new java.lang.IllegalStateException("Unexpected token: ".concat(anty.ap(i)));
                }
                akexVar.q();
                return defpackage.akee.a;
            }
            akehVar = new defpackage.akeh(java.lang.Boolean.valueOf(akexVar.t()));
        }
        return akehVar;
    }

    public static final defpackage.akec z(akex akexVar, int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            akexVar.m();
            return new defpackage.akeb();
        }
        if (i2 != 2) {
            return null;
        }
        akexVar.n();
        return new defpackage.akef();
    }

    public final void x(defpackage.akey akeyVar, defpackage.akec akecVar) throws java.io.IOException {
        if (akecVar == null || (akecVar instanceof defpackage.akee)) {
            akeyVar.f();
            return;
        }
        if (!(akecVar instanceof defpackage.akeh)) {
            if (akecVar instanceof defpackage.akeb) {
                akeyVar.d();
                akeyVar.g(1, '[');
                java.util.Iterator it = akecVar.d().iterator();
                while (it.hasNext()) {
                    x(akeyVar, (defpackage.akec) it.next());
                }
                akeyVar.e(1, 2, ']');
                return;
            }
            if (!(akecVar instanceof defpackage.akef)) {
                throw new java.lang.IllegalArgumentException("Couldn't write ".concat(java.lang.String.valueOf(java.lang.String.valueOf(akecVar.getClass()))));
            }
            akeyVar.d();
            akeyVar.g(3, '{');
            defpackage.akel akelVar = new defpackage.akel((defpackage.akem) akecVar.e().c());
            while (akelVar.hasNext()) {
                defpackage.akeq akeqVarA = akelVar.a();
                java.lang.String str = (java.lang.String) akeqVarA.f;
                j$.util.Objects.requireNonNull(str, "name == null");
                if (akeyVar.d != null) {
                    throw new java.lang.IllegalStateException("Already wrote a name, expecting a value.");
                }
                int iA = akeyVar.a();
                if (iA != 3 && iA != 5) {
                    throw new java.lang.IllegalStateException("Please begin an object before writing a name.");
                }
                akeyVar.d = str;
                x(akeyVar, (defpackage.akec) akeqVarA.h);
            }
            akeyVar.e(3, 5, '}');
            return;
        }
        defpackage.akeh akehVarF = akecVar.f();
        if (!akehVarF.j()) {
            if (akehVarF.i()) {
                boolean zBooleanValue = akehVarF.i() ? ((java.lang.Boolean) akehVarF.a).booleanValue() : java.lang.Boolean.parseBoolean(akehVarF.a());
                akeyVar.d();
                akeyVar.b();
                akeyVar.b.write(true != zBooleanValue ? "false" : "true");
                return;
            }
            java.lang.String strA = akehVarF.a();
            if (strA == null) {
                akeyVar.f();
                return;
            }
            akeyVar.d();
            akeyVar.b();
            akeyVar.c(strA);
            return;
        }
        java.lang.Number numberC = akehVarF.c();
        if (numberC == null) {
            akeyVar.f();
            return;
        }
        akeyVar.d();
        java.lang.String string = numberC.toString();
        java.lang.Class<?> cls = numberC.getClass();
        if (cls != java.lang.Integer.class && cls != java.lang.Long.class && cls != java.lang.Byte.class && cls != java.lang.Short.class && cls != java.math.BigDecimal.class && cls != java.math.BigInteger.class && cls != java.util.concurrent.atomic.AtomicInteger.class && cls != java.util.concurrent.atomic.AtomicLong.class) {
            if (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN")) {
                if (akeyVar.c != akej.a) {
                    throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(string)));
                }
            } else if (cls != java.lang.Float.class && cls != java.lang.Double.class && !defpackage.akey.a.matcher(string).matches()) {
                throw new java.lang.IllegalArgumentException("String created by " + java.lang.String.valueOf(cls) + " is not a valid JSON number: " + string);
            }
        }
        akeyVar.b();
        akeyVar.b.append((java.lang.CharSequence) string);
    }
}
