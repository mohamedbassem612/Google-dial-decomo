package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class u {
    public static final j$.desugar.sun.nio.fs.n h = new j$.desugar.sun.nio.fs.n(2);
    public static final java.util.HashMap i;
    public j$.time.format.u a;
    public final j$.time.format.u b;
    public final java.util.ArrayList c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        java.util.HashMap map = new java.util.HashMap();
        i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.f fVar = j$.time.temporal.h.a;
        map.put('Q', fVar);
        map.put('q', fVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.j.a);
    }

    public u() {
        this.a = this;
        this.c = new java.util.ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public final void a(j$.time.format.DateTimeFormatter dateTimeFormatter) {
        j$.util.Objects.requireNonNull(dateTimeFormatter, "formatter");
        j$.time.format.d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new j$.time.format.d(dVar.a, false);
        }
        c(dVar);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new j$.time.format.f(aVar, i2, i3, z));
        } else {
            j(new j$.time.format.f(aVar, i2, i3, z));
        }
    }

    public final int c(j$.time.format.e eVar) {
        j$.util.Objects.requireNonNull(eVar, "pp");
        j$.time.format.u uVar = this.a;
        int i2 = uVar.e;
        if (i2 > 0) {
            if (eVar != null) {
                eVar = new j$.time.format.k(eVar, i2, uVar.f);
            }
            uVar.e = 0;
            uVar.f = (char) 0;
        }
        uVar.c.add(eVar);
        j$.time.format.u uVar2 = this.a;
        uVar2.g = -1;
        return uVar2.c.size() - 1;
    }

    public final void d(char c) {
        c(new j$.time.format.c(c));
    }

    public final void e(java.lang.String str) {
        j$.util.Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        byte b = 1;
        if (str.length() == 1) {
            c(new j$.time.format.c(str.charAt(0)));
        } else {
            c(new j$.time.format.h(b, str));
        }
    }

    public final void f(j$.time.format.TextStyle textStyle) {
        j$.util.Objects.requireNonNull(textStyle, "style");
        if (textStyle == j$.time.format.TextStyle.FULL || textStyle == j$.time.format.TextStyle.SHORT) {
            c(new j$.time.format.h((byte) 0, textStyle));
        } else {
            j$.time.g.b("Style must be either full or short");
        }
    }

    public final void g(java.lang.String str, java.lang.String str2) {
        c(new j$.time.format.j(str, str2));
    }

    public final void h(j$.time.temporal.a aVar, java.util.HashMap map) {
        j$.util.Objects.requireNonNull(aVar, "field");
        j$.util.Objects.requireNonNull(map, "textLookup");
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(map);
        j$.time.format.TextStyle textStyle = j$.time.format.TextStyle.FULL;
        c(new j$.time.format.q(aVar, textStyle, new j$.time.format.a(new j$.time.format.y(java.util.Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void i(j$.time.temporal.l lVar, j$.time.format.TextStyle textStyle) {
        j$.util.Objects.requireNonNull(lVar, "field");
        j$.util.Objects.requireNonNull(textStyle, "textStyle");
        c(new j$.time.format.q(lVar, textStyle, j$.time.format.z.c));
    }

    public final void j(j$.time.format.i iVar) {
        j$.time.format.i iVarD;
        j$.time.format.u uVar = this.a;
        int i2 = uVar.g;
        if (i2 < 0) {
            uVar.g = c(iVar);
            return;
        }
        j$.time.format.i iVar2 = (j$.time.format.i) uVar.c.get(i2);
        int i3 = iVar.b;
        int i4 = iVar.c;
        if (i3 == i4 && iVar.d == j$.time.format.d0.NOT_NEGATIVE) {
            iVarD = iVar2.e(i4);
            c(iVar.d());
            this.a.g = i2;
        } else {
            iVarD = iVar2.d();
            this.a.g = c(iVar);
        }
        this.a.c.set(i2, iVarD);
    }

    public final void k(j$.time.temporal.l lVar) {
        j$.util.Objects.requireNonNull(lVar, "field");
        j(new j$.time.format.i(lVar, 1, 19, j$.time.format.d0.NORMAL));
    }

    public final void l(j$.time.temporal.l lVar, int i2) {
        j$.util.Objects.requireNonNull(lVar, "field");
        if (i2 < 1 || i2 > 19) {
            j$.time.g.g("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            j(new j$.time.format.i(lVar, i2, i2, j$.time.format.d0.NOT_NEGATIVE));
        }
    }

    public final void m(j$.time.temporal.l lVar, int i2, int i3, j$.time.format.d0 d0Var) {
        if (i2 == i3 && d0Var == j$.time.format.d0.NOT_NEGATIVE) {
            l(lVar, i3);
            return;
        }
        j$.util.Objects.requireNonNull(lVar, "field");
        j$.util.Objects.requireNonNull(d0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.g.g("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.g.g("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 >= i2) {
            j(new j$.time.format.i(lVar, i2, i3, d0Var));
            return;
        }
        throw new java.lang.IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void n() {
        j$.time.format.u uVar = this.a;
        if (uVar.b == null) {
            throw new java.lang.IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = uVar.c.size();
        j$.time.format.u uVar2 = this.a;
        if (size <= 0) {
            this.a = uVar2.b;
            return;
        }
        j$.time.format.d dVar = new j$.time.format.d(uVar2.c, uVar2.d);
        this.a = this.a.b;
        c(dVar);
    }

    public final void o() {
        j$.time.format.u uVar = this.a;
        uVar.g = -1;
        this.a = new j$.time.format.u(uVar);
    }

    public final j$.time.format.DateTimeFormatter p(j$.time.format.c0 c0Var, j$.time.chrono.q qVar) {
        return q(java.util.Locale.getDefault(), c0Var, qVar);
    }

    public final j$.time.format.DateTimeFormatter q(java.util.Locale locale, j$.time.format.c0 c0Var, j$.time.chrono.q qVar) {
        j$.util.Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            n();
        }
        return new j$.time.format.DateTimeFormatter(new j$.time.format.d(this.c, false), locale, j$.time.format.a0.a, c0Var, qVar, null);
    }

    public u(j$.time.format.u uVar) {
        this.a = this;
        this.c = new java.util.ArrayList();
        this.g = -1;
        this.b = uVar;
        this.d = true;
    }
}
