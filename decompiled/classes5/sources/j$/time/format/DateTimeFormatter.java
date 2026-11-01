package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class DateTimeFormatter {
    public static final j$.time.format.DateTimeFormatter ISO_INSTANT;
    public static final j$.time.format.DateTimeFormatter ISO_LOCAL_DATE;
    public final j$.time.format.d a;
    public final java.util.Locale b;
    public final j$.time.format.a0 c;
    public final j$.time.format.c0 d;
    public final j$.time.chrono.q e;
    public final j$.time.ZoneId f;

    static {
        j$.time.format.u uVar = new j$.time.format.u();
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        j$.time.format.d0 d0Var = j$.time.format.d0.EXCEEDS_PAD;
        uVar.m(aVar, 4, 10, d0Var);
        uVar.d('-');
        j$.time.temporal.a aVar2 = j$.time.temporal.a.MONTH_OF_YEAR;
        uVar.l(aVar2, 2);
        uVar.d('-');
        j$.time.temporal.a aVar3 = j$.time.temporal.a.DAY_OF_MONTH;
        uVar.l(aVar3, 2);
        j$.time.format.c0 c0Var = j$.time.format.c0.STRICT;
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        j$.time.format.DateTimeFormatter dateTimeFormatterP = uVar.p(c0Var, qVar);
        ISO_LOCAL_DATE = dateTimeFormatterP;
        j$.time.format.u uVar2 = new j$.time.format.u();
        j$.time.format.p pVar = j$.time.format.p.INSENSITIVE;
        uVar2.c(pVar);
        uVar2.a(dateTimeFormatterP);
        j$.time.format.j jVar = j$.time.format.j.e;
        uVar2.c(jVar);
        uVar2.p(c0Var, qVar);
        j$.time.format.u uVar3 = new j$.time.format.u();
        uVar3.c(pVar);
        uVar3.a(dateTimeFormatterP);
        uVar3.o();
        uVar3.c(jVar);
        uVar3.p(c0Var, qVar);
        j$.time.format.u uVar4 = new j$.time.format.u();
        j$.time.temporal.a aVar4 = j$.time.temporal.a.HOUR_OF_DAY;
        uVar4.l(aVar4, 2);
        uVar4.d(':');
        j$.time.temporal.a aVar5 = j$.time.temporal.a.MINUTE_OF_HOUR;
        uVar4.l(aVar5, 2);
        uVar4.o();
        uVar4.d(':');
        j$.time.temporal.a aVar6 = j$.time.temporal.a.SECOND_OF_MINUTE;
        uVar4.l(aVar6, 2);
        uVar4.o();
        uVar4.b(j$.time.temporal.a.NANO_OF_SECOND, 0, 9, true);
        j$.time.format.DateTimeFormatter dateTimeFormatterP2 = uVar4.p(c0Var, null);
        j$.time.format.u uVar5 = new j$.time.format.u();
        uVar5.c(pVar);
        uVar5.a(dateTimeFormatterP2);
        uVar5.c(jVar);
        uVar5.p(c0Var, null);
        j$.time.format.u uVar6 = new j$.time.format.u();
        uVar6.c(pVar);
        uVar6.a(dateTimeFormatterP2);
        uVar6.o();
        uVar6.c(jVar);
        uVar6.p(c0Var, null);
        j$.time.format.u uVar7 = new j$.time.format.u();
        uVar7.c(pVar);
        uVar7.a(dateTimeFormatterP);
        uVar7.d('T');
        uVar7.a(dateTimeFormatterP2);
        j$.time.format.DateTimeFormatter dateTimeFormatterP3 = uVar7.p(c0Var, qVar);
        j$.time.format.u uVar8 = new j$.time.format.u();
        uVar8.c(pVar);
        uVar8.a(dateTimeFormatterP3);
        j$.time.format.p pVar2 = j$.time.format.p.LENIENT;
        uVar8.c(pVar2);
        uVar8.c(jVar);
        j$.time.format.p pVar3 = j$.time.format.p.STRICT;
        uVar8.c(pVar3);
        j$.time.format.DateTimeFormatter dateTimeFormatterP4 = uVar8.p(c0Var, qVar);
        j$.time.format.u uVar9 = new j$.time.format.u();
        uVar9.a(dateTimeFormatterP4);
        uVar9.o();
        uVar9.d('[');
        j$.time.format.p pVar4 = j$.time.format.p.SENSITIVE;
        uVar9.c(pVar4);
        j$.desugar.sun.nio.fs.n nVar = j$.time.format.u.h;
        uVar9.c(new j$.time.format.s(nVar, "ZoneRegionId()"));
        uVar9.d(']');
        uVar9.p(c0Var, qVar);
        j$.time.format.u uVar10 = new j$.time.format.u();
        uVar10.a(dateTimeFormatterP3);
        uVar10.o();
        uVar10.c(jVar);
        uVar10.o();
        uVar10.d('[');
        uVar10.c(pVar4);
        uVar10.c(new j$.time.format.s(nVar, "ZoneRegionId()"));
        uVar10.d(']');
        uVar10.p(c0Var, qVar);
        j$.time.format.u uVar11 = new j$.time.format.u();
        uVar11.c(pVar);
        uVar11.m(aVar, 4, 10, d0Var);
        uVar11.d('-');
        uVar11.l(j$.time.temporal.a.DAY_OF_YEAR, 3);
        uVar11.o();
        uVar11.c(jVar);
        uVar11.p(c0Var, qVar);
        j$.time.format.u uVar12 = new j$.time.format.u();
        uVar12.c(pVar);
        uVar12.m(j$.time.temporal.h.c, 4, 10, d0Var);
        uVar12.e("-W");
        uVar12.l(j$.time.temporal.h.b, 2);
        uVar12.d('-');
        j$.time.temporal.a aVar7 = j$.time.temporal.a.DAY_OF_WEEK;
        uVar12.l(aVar7, 1);
        uVar12.o();
        uVar12.c(jVar);
        uVar12.p(c0Var, qVar);
        j$.time.format.u uVar13 = new j$.time.format.u();
        uVar13.c(pVar);
        uVar13.c(new j$.time.format.g());
        ISO_INSTANT = uVar13.p(c0Var, null);
        j$.time.format.u uVar14 = new j$.time.format.u();
        uVar14.c(pVar);
        uVar14.l(aVar, 4);
        uVar14.l(aVar2, 2);
        uVar14.l(aVar3, 2);
        uVar14.o();
        uVar14.c(pVar2);
        uVar14.g("+HHMMss", "Z");
        uVar14.c(pVar3);
        uVar14.p(c0Var, qVar);
        java.util.HashMap map = new java.util.HashMap();
        map.put(1L, "Mon");
        map.put(2L, "Tue");
        map.put(3L, "Wed");
        map.put(4L, "Thu");
        map.put(5L, "Fri");
        map.put(6L, "Sat");
        map.put(7L, "Sun");
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put(1L, "Jan");
        map2.put(2L, "Feb");
        map2.put(3L, "Mar");
        map2.put(4L, "Apr");
        map2.put(5L, "May");
        map2.put(6L, "Jun");
        map2.put(7L, "Jul");
        map2.put(8L, "Aug");
        map2.put(9L, "Sep");
        map2.put(10L, "Oct");
        map2.put(11L, "Nov");
        map2.put(12L, "Dec");
        j$.time.format.u uVar15 = new j$.time.format.u();
        uVar15.c(pVar);
        uVar15.c(pVar2);
        uVar15.o();
        uVar15.h(aVar7, map);
        uVar15.e(", ");
        uVar15.n();
        uVar15.m(aVar3, 1, 2, j$.time.format.d0.NOT_NEGATIVE);
        uVar15.d(' ');
        uVar15.h(aVar2, map2);
        uVar15.d(' ');
        uVar15.l(aVar, 4);
        uVar15.d(' ');
        uVar15.l(aVar4, 2);
        uVar15.d(':');
        uVar15.l(aVar5, 2);
        uVar15.o();
        uVar15.d(':');
        uVar15.l(aVar6, 2);
        uVar15.n();
        uVar15.d(' ');
        uVar15.g("+HHMM", "GMT");
        uVar15.p(j$.time.format.c0.SMART, qVar);
    }

    public DateTimeFormatter(j$.time.format.d dVar, java.util.Locale locale, j$.time.format.a0 a0Var, j$.time.format.c0 c0Var, j$.time.chrono.q qVar, j$.time.ZoneId zoneId) {
        this.a = (j$.time.format.d) j$.util.Objects.requireNonNull(dVar, "printerParser");
        this.b = (java.util.Locale) j$.util.Objects.requireNonNull(locale, "locale");
        this.c = (j$.time.format.a0) j$.util.Objects.requireNonNull(a0Var, "decimalStyle");
        this.d = (j$.time.format.c0) j$.util.Objects.requireNonNull(c0Var, "resolverStyle");
        this.e = qVar;
        this.f = zoneId;
    }

    public static j$.time.format.DateTimeParseException a(java.lang.CharSequence charSequence, java.lang.RuntimeException runtimeException) {
        java.lang.String string;
        if (charSequence.length() > 64) {
            string = charSequence.subSequence(0, 64).toString() + "...";
        } else {
            string = charSequence.toString();
        }
        j$.time.format.DateTimeParseException dateTimeParseException = new j$.time.format.DateTimeParseException(j$.desugar.sun.nio.fs.h.b("Text '", string, "' could not be parsed: ", runtimeException.getMessage()), runtimeException);
        charSequence.toString();
        return dateTimeParseException;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:111:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:148:0x023a  */
    /* JADX WARN: Code duplicated, block: B:238:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:241:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:274:0x01bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x03d6 A[SYNTHETIC] */
    public static j$.time.format.DateTimeFormatter ofPattern(java.lang.String str) {
        java.lang.String strSubstring;
        boolean z;
        int i;
        int i2;
        j$.time.format.u uVar = new j$.time.format.u();
        j$.util.Objects.requireNonNull(str, "pattern");
        int i3 = 0;
        while (i3 < str.length()) {
            char cCharAt = str.charAt(i3);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i4 = i3 + 1;
                while (i4 < str.length() && str.charAt(i4) == cCharAt) {
                    i4++;
                }
                int i5 = i4 - i3;
                if (cCharAt == 'p') {
                    if (i4 >= str.length() || (((cCharAt = str.charAt(i4)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i = i4;
                        i2 = i5;
                        i5 = 0;
                    } else {
                        i = i4 + 1;
                        while (i < str.length() && str.charAt(i) == cCharAt) {
                            i++;
                        }
                        i2 = i - i4;
                    }
                    if (i5 == 0) {
                        j$.time.g.b("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                        return null;
                    }
                    if (i5 < 1) {
                        j$.time.g.g("The pad width must be at least one but was ", i5);
                        return null;
                    }
                    j$.time.format.u uVar2 = uVar.a;
                    uVar2.e = i5;
                    uVar2.f = ' ';
                    uVar2.g = -1;
                    i5 = i2;
                    i4 = i;
                }
                char c = cCharAt;
                j$.time.temporal.l lVar = (j$.time.temporal.l) j$.time.format.u.i.get(java.lang.Character.valueOf(c));
                if (lVar != null) {
                    if (c == 'A') {
                        uVar.m(lVar, i5, 19, j$.time.format.d0.NOT_NEGATIVE);
                    } else {
                        if (c == 'Q') {
                            z = false;
                        } else if (c == 'S') {
                            uVar.b(j$.time.temporal.a.NANO_OF_SECOND, i5, i5, false);
                        } else if (c == 'a') {
                            if (i5 != 1) {
                                j$.time.g.i("Too many pattern letters: ", c);
                                return null;
                            }
                            uVar.i(lVar, j$.time.format.TextStyle.SHORT);
                        } else if (c == 'k') {
                            if (i5 == 1) {
                                uVar.k(lVar);
                            } else {
                                if (i5 == 2) {
                                    j$.time.g.i("Too many pattern letters: ", c);
                                    return null;
                                }
                                uVar.l(lVar, i5);
                            }
                        } else if (c == 'q') {
                            z = true;
                        } else if (c == 's') {
                            if (i5 == 1) {
                                uVar.k(lVar);
                            } else {
                                if (i5 == 2) {
                                    j$.time.g.i("Too many pattern letters: ", c);
                                    return null;
                                }
                                uVar.l(lVar, i5);
                            }
                        } else if (c == 'u' || c == 'y') {
                            if (i5 == 2) {
                                j$.time.LocalDate localDate = j$.time.format.o.h;
                                j$.util.Objects.requireNonNull(lVar, "field");
                                j$.util.Objects.requireNonNull(localDate, "baseDate");
                                j$.time.format.o oVar = new j$.time.format.o(lVar, 2, 2, localDate, 0);
                                if (localDate == null) {
                                    if (!lVar.range().e(0L)) {
                                        j$.time.g.b("The base value must be within the range of the field");
                                        return null;
                                    }
                                    if (j$.time.format.i.f[2] > 2147483647L) {
                                        j$.time.g.h("Unable to add printer-parser as the range exceeds the capacity of an int");
                                        return null;
                                    }
                                }
                                uVar.j(oVar);
                            } else if (i5 < 4) {
                                uVar.m(lVar, i5, 19, j$.time.format.d0.NORMAL);
                            } else {
                                uVar.m(lVar, i5, 19, j$.time.format.d0.EXCEEDS_PAD);
                            }
                        } else if (c == 'g') {
                            uVar.m(lVar, i5, 19, j$.time.format.d0.NORMAL);
                        } else if (c == 'h' || c == 'm') {
                            if (i5 == 1) {
                                uVar.k(lVar);
                            } else {
                                if (i5 == 2) {
                                    j$.time.g.i("Too many pattern letters: ", c);
                                    return null;
                                }
                                uVar.l(lVar, i5);
                            }
                        } else if (c != 'n') {
                            switch (c) {
                                case 'D':
                                    if (i5 == 1) {
                                        uVar.k(lVar);
                                    } else {
                                        if (i5 != 2 && i5 != 3) {
                                            j$.time.g.i("Too many pattern letters: ", c);
                                            return null;
                                        }
                                        uVar.m(lVar, i5, 3, j$.time.format.d0.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    z = false;
                                    break;
                                case 'F':
                                    if (i5 != 1) {
                                        j$.time.g.i("Too many pattern letters: ", c);
                                        return null;
                                    }
                                    uVar.k(lVar);
                                    break;
                                    break;
                                case 'G':
                                    if (i5 == 1 || i5 == 2 || i5 == 3) {
                                        uVar.i(lVar, j$.time.format.TextStyle.SHORT);
                                    } else if (i5 == 4) {
                                        uVar.i(lVar, j$.time.format.TextStyle.FULL);
                                    } else {
                                        if (i5 != 5) {
                                            j$.time.g.i("Too many pattern letters: ", c);
                                            return null;
                                        }
                                        uVar.i(lVar, j$.time.format.TextStyle.NARROW);
                                    }
                                    break;
                                default:
                                    switch (c) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            z = true;
                                            break;
                                        case 'M':
                                            z = false;
                                            break;
                                        case 'N':
                                            uVar.m(lVar, i5, 19, j$.time.format.d0.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (c) {
                                                case 'c':
                                                    if (i5 == 1) {
                                                        uVar.j(new j$.time.format.r(c, i5, i5, i5, 0));
                                                    } else {
                                                        if (i5 == 2) {
                                                            j$.time.g.b("Invalid pattern \"cc\"");
                                                            return null;
                                                        }
                                                        z = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case 'e':
                                                    z = false;
                                                    break;
                                                default:
                                                    if (i5 != 1) {
                                                        uVar.l(lVar, i5);
                                                    } else {
                                                        uVar.k(lVar);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 'H':
                                    if (i5 == 1) {
                                        uVar.k(lVar);
                                    } else {
                                        if (i5 == 2) {
                                            j$.time.g.i("Too many pattern letters: ", c);
                                            return null;
                                        }
                                        uVar.l(lVar, i5);
                                    }
                                    break;
                            }
                        } else {
                            uVar.m(lVar, i5, 19, j$.time.format.d0.NOT_NEGATIVE);
                        }
                        if (i5 == 1 || i5 == 2) {
                            if (c == 'e') {
                                uVar.j(new j$.time.format.r(c, i5, i5, i5, 0));
                            } else if (c == 'E') {
                                uVar.i(lVar, j$.time.format.TextStyle.SHORT);
                            } else if (i5 == 1) {
                                uVar.k(lVar);
                            } else {
                                uVar.l(lVar, 2);
                            }
                        } else if (i5 == 3) {
                            uVar.i(lVar, z ? j$.time.format.TextStyle.SHORT_STANDALONE : j$.time.format.TextStyle.SHORT);
                        } else if (i5 == 4) {
                            uVar.i(lVar, z ? j$.time.format.TextStyle.FULL_STANDALONE : j$.time.format.TextStyle.FULL);
                        } else {
                            if (i5 != 5) {
                                j$.time.g.i("Too many pattern letters: ", c);
                                return null;
                            }
                            uVar.i(lVar, z ? j$.time.format.TextStyle.NARROW_STANDALONE : j$.time.format.TextStyle.NARROW);
                        }
                    }
                } else if (c == 'z') {
                    if (i5 > 4) {
                        j$.time.g.i("Too many pattern letters: ", c);
                        return null;
                    }
                    if (i5 == 4) {
                        uVar.c(new j$.time.format.t(j$.time.format.TextStyle.FULL, false));
                    } else {
                        uVar.c(new j$.time.format.t(j$.time.format.TextStyle.SHORT, false));
                    }
                } else if (c == 'V') {
                    if (i5 != 2) {
                        j$.time.g.i("Pattern letter count must be 2: ", c);
                        return null;
                    }
                    uVar.c(new j$.time.format.s(j$.time.temporal.m.a, "ZoneId()"));
                } else if (c != 'v') {
                    java.lang.String str2 = "+0000";
                    if (c == 'Z') {
                        if (i5 < 4) {
                            uVar.g("+HHMM", "+0000");
                        } else if (i5 == 4) {
                            uVar.f(j$.time.format.TextStyle.FULL);
                        } else {
                            if (i5 != 5) {
                                j$.time.g.i("Too many pattern letters: ", c);
                                return null;
                            }
                            uVar.g("+HH:MM:ss", "Z");
                        }
                    } else if (c == 'O') {
                        if (i5 == 1) {
                            uVar.f(j$.time.format.TextStyle.SHORT);
                        } else {
                            if (i5 != 4) {
                                j$.time.g.i("Pattern letter count must be 1 or 4: ", c);
                                return null;
                            }
                            uVar.f(j$.time.format.TextStyle.FULL);
                        }
                    } else if (c == 'X') {
                        if (i5 > 5) {
                            j$.time.g.i("Too many pattern letters: ", c);
                            return null;
                        }
                        uVar.g(j$.time.format.j.d[i5 + (i5 == 1 ? 0 : 1)], "Z");
                    } else if (c == 'x') {
                        if (i5 > 5) {
                            j$.time.g.i("Too many pattern letters: ", c);
                            return null;
                        }
                        if (i5 == 1) {
                            str2 = "+00";
                        } else if (i5 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        uVar.g(j$.time.format.j.d[i5 + (i5 == 1 ? 0 : 1)], str2);
                    } else if (c == 'W') {
                        if (i5 > 1) {
                            j$.time.g.i("Too many pattern letters: ", c);
                            return null;
                        }
                        uVar.j(new j$.time.format.r(c, i5, i5, i5, 0));
                    } else if (c == 'w') {
                        if (i5 > 2) {
                            j$.time.g.i("Too many pattern letters: ", c);
                            return null;
                        }
                        uVar.j(new j$.time.format.r(c, i5, i5, 2, 0));
                    } else {
                        if (c != 'Y') {
                            j$.time.g.i("Unknown pattern letter: ", c);
                            return null;
                        }
                        if (i5 == 2) {
                            uVar.j(new j$.time.format.r(c, i5, i5, 2, 0));
                        } else {
                            int i6 = i5;
                            uVar.j(new j$.time.format.r(c, i6, i6, 19, 0));
                        }
                    }
                } else if (i5 == 1) {
                    uVar.c(new j$.time.format.t(j$.time.format.TextStyle.SHORT, true));
                } else {
                    if (i5 != 4) {
                        j$.time.g.i("Wrong number of  pattern letters: ", c);
                        return null;
                    }
                    uVar.c(new j$.time.format.t(j$.time.format.TextStyle.FULL, true));
                }
                i3 = i4 - 1;
            } else if (cCharAt == '\'') {
                int i7 = i3 + 1;
                int i8 = i7;
                while (i8 < str.length()) {
                    if (str.charAt(i8) == '\'') {
                        int i9 = i8 + 1;
                        if (i9 < str.length() && str.charAt(i9) == '\'') {
                            i8 = i9;
                        } else {
                            if (i8 < str.length()) {
                                j$.time.g.b("Pattern ends with an incomplete string literal: ".concat(str));
                                return null;
                            }
                            strSubstring = str.substring(i7, i8);
                            if (strSubstring.isEmpty()) {
                                uVar.d('\'');
                            } else {
                                uVar.e(strSubstring.replace("''", "'"));
                            }
                            i3 = i8;
                        }
                    }
                    i8++;
                }
                if (i8 < str.length()) {
                    j$.time.g.b("Pattern ends with an incomplete string literal: ".concat(str));
                    return null;
                }
                strSubstring = str.substring(i7, i8);
                if (strSubstring.isEmpty()) {
                    uVar.d('\'');
                } else {
                    uVar.e(strSubstring.replace("''", "'"));
                }
                i3 = i8;
            } else if (cCharAt == '[') {
                uVar.o();
            } else if (cCharAt == ']') {
                if (uVar.a.b == null) {
                    j$.time.g.b("Pattern invalid as it contains ] without previous [");
                    return null;
                }
                uVar.n();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new java.lang.IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                uVar.d(cCharAt);
            }
            i3++;
        }
        return uVar.q(java.util.Locale.getDefault(), j$.time.format.c0.SMART, null);
    }

    /* JADX WARN: Code duplicated, block: B:164:0x0230 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:165:0x0238 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0204  */
    /* JADX WARN: Code duplicated, block: B:97:0x0220  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final j$.time.format.b0 b(java.lang.CharSequence charSequence) {
        j$.time.q qVar;
        j$.time.q qVar2;
        j$.time.temporal.l lVar;
        j$.time.temporal.a aVar;
        j$.time.temporal.l lVar2;
        int i = 0;
        java.text.ParsePosition parsePosition = new java.text.ParsePosition(0);
        j$.util.Objects.requireNonNull(charSequence, "text");
        j$.util.Objects.requireNonNull(parsePosition, "position");
        j$.time.format.v vVar = new j$.time.format.v(this);
        int iK = this.a.k(vVar, charSequence, parsePosition.getIndex());
        if (iK < 0) {
            parsePosition.setErrorIndex(~iK);
            vVar = null;
        } else {
            parsePosition.setIndex(iK);
        }
        if (vVar != null) {
            j$.time.format.DateTimeFormatter dateTimeFormatter = vVar.a;
            if (parsePosition.getErrorIndex() < 0 && parsePosition.getIndex() >= charSequence.length()) {
                j$.time.format.b0 b0VarC = vVar.c();
                j$.time.chrono.a aVar2 = vVar.c().c;
                if (aVar2 == null && (aVar2 = dateTimeFormatter.e) == null) {
                    aVar2 = j$.time.chrono.q.c;
                }
                b0VarC.c = aVar2;
                java.util.HashMap map = b0VarC.a;
                j$.time.ZoneId zoneId = b0VarC.b;
                if (zoneId == null) {
                    zoneId = dateTimeFormatter.f;
                }
                b0VarC.b = zoneId;
                b0VarC.e = this.d;
                b0VarC.f();
                b0VarC.o(b0VarC.c.R(map, b0VarC.e));
                b0VarC.m();
                if (map.size() > 0) {
                    loop0: while (i < 50) {
                        java.util.Iterator it = map.entrySet().iterator();
                        do {
                            if (!it.hasNext()) {
                                break loop0;
                            }
                            lVar2 = (j$.time.temporal.l) ((java.util.Map.Entry) it.next()).getKey();
                            j$.time.temporal.TemporalAccessor temporalAccessorP = lVar2.p(map, b0VarC, b0VarC.e);
                            if (temporalAccessorP != null) {
                                if (temporalAccessorP instanceof j$.time.chrono.ChronoZonedDateTime) {
                                    j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime = (j$.time.chrono.ChronoZonedDateTime) temporalAccessorP;
                                    j$.time.ZoneId zoneId2 = b0VarC.b;
                                    if (zoneId2 == null) {
                                        b0VarC.b = chronoZonedDateTime.getZone();
                                    } else if (!zoneId2.equals(chronoZonedDateTime.getZone())) {
                                        j$.time.g.h("ChronoZonedDateTime must use the effective parsed zone: ".concat(java.lang.String.valueOf(b0VarC.b)));
                                        return null;
                                    }
                                    temporalAccessorP = chronoZonedDateTime.toLocalDateTime();
                                }
                                if (temporalAccessorP instanceof j$.time.chrono.d) {
                                    j$.time.chrono.d dVar = (j$.time.chrono.d) temporalAccessorP;
                                    b0VarC.n(dVar.toLocalTime(), j$.time.q.d);
                                    b0VarC.o(dVar.toLocalDate());
                                    break;
                                }
                                if (temporalAccessorP instanceof j$.time.chrono.ChronoLocalDate) {
                                    b0VarC.o((j$.time.chrono.ChronoLocalDate) temporalAccessorP);
                                    break;
                                }
                                if (temporalAccessorP instanceof j$.time.j) {
                                    b0VarC.n((j$.time.j) temporalAccessorP, j$.time.q.d);
                                    break;
                                }
                                j$.time.g.h("Method resolve() can only return ChronoZonedDateTime, ChronoLocalDateTime, ChronoLocalDate or LocalTime");
                                return null;
                            }
                        } while (map.containsKey(lVar2));
                        i++;
                    }
                    if (i == 50) {
                        j$.time.g.h("One of the parsed fields has an incorrectly implemented resolve method");
                        return null;
                    }
                    if (i > 0) {
                        b0VarC.f();
                        b0VarC.o(b0VarC.c.R(map, b0VarC.e));
                        b0VarC.m();
                    }
                }
                long j = 1000000;
                if (b0VarC.g == null) {
                    j$.time.temporal.l lVar3 = j$.time.temporal.a.MILLI_OF_SECOND;
                    if (map.containsKey(lVar3)) {
                        long jLongValue = ((java.lang.Long) map.remove(lVar3)).longValue();
                        j$.time.temporal.a aVar3 = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (map.containsKey(aVar3)) {
                            long jLongValue2 = (((java.lang.Long) map.get(aVar3)).longValue() % 1000) + (jLongValue * 1000);
                            b0VarC.p(lVar3, aVar3, java.lang.Long.valueOf(jLongValue2));
                            map.remove(aVar3);
                            map.put(j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(jLongValue2 * 1000));
                        } else {
                            map.put(j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(jLongValue * 1000000));
                        }
                    } else {
                        java.lang.Object obj = j$.time.temporal.a.MICRO_OF_SECOND;
                        if (map.containsKey(obj)) {
                            map.put(j$.time.temporal.a.NANO_OF_SECOND, java.lang.Long.valueOf(((java.lang.Long) map.remove(obj)).longValue() * 1000));
                        }
                    }
                    java.lang.Object obj2 = j$.time.temporal.a.HOUR_OF_DAY;
                    java.lang.Long l = (java.lang.Long) map.get(obj2);
                    if (l != null) {
                        java.lang.Object obj3 = j$.time.temporal.a.MINUTE_OF_HOUR;
                        java.lang.Long l2 = (java.lang.Long) map.get(obj3);
                        java.lang.Object obj4 = j$.time.temporal.a.SECOND_OF_MINUTE;
                        java.lang.Long l3 = (java.lang.Long) map.get(obj4);
                        java.lang.Object obj5 = j$.time.temporal.a.NANO_OF_SECOND;
                        java.lang.Long l4 = (java.lang.Long) map.get(obj5);
                        if (l2 != null ? l3 != null || l4 == null : l3 == null && l4 == null) {
                            b0VarC.j(l.longValue(), l2 != null ? l2.longValue() : 0L, l3 != null ? l3.longValue() : 0L, l4 != null ? l4.longValue() : 0L);
                            map.remove(obj2);
                            map.remove(obj3);
                            map.remove(obj4);
                            map.remove(obj5);
                        } else {
                            j = 1000000;
                        }
                    }
                    if (b0VarC.e != j$.time.format.c0.LENIENT && map.size() > 0) {
                        for (java.util.Map.Entry entry : map.entrySet()) {
                            lVar = (j$.time.temporal.l) entry.getKey();
                            if (lVar instanceof j$.time.temporal.a) {
                                aVar = (j$.time.temporal.a) lVar;
                                if (aVar.y()) {
                                    aVar.t(((java.lang.Long) entry.getValue()).longValue());
                                }
                            }
                        }
                    }
                } else if (b0VarC.e != j$.time.format.c0.LENIENT) {
                    while (r0.hasNext()) {
                        lVar = (j$.time.temporal.l) entry.getKey();
                        if (lVar instanceof j$.time.temporal.a) {
                            aVar = (j$.time.temporal.a) lVar;
                            if (aVar.y()) {
                                aVar.t(((java.lang.Long) entry.getValue()).longValue());
                            }
                        }
                    }
                }
                j$.time.temporal.TemporalAccessor temporalAccessor = b0VarC.f;
                if (temporalAccessor != null) {
                    b0VarC.e(temporalAccessor);
                }
                j$.time.temporal.TemporalAccessor temporalAccessor2 = b0VarC.g;
                if (temporalAccessor2 != null) {
                    b0VarC.e(temporalAccessor2);
                    if (b0VarC.f != null && map.size() > 0) {
                        b0VarC.e(b0VarC.f.F(b0VarC.g));
                    }
                }
                j$.time.chrono.ChronoLocalDate chronoLocalDate = b0VarC.f;
                if (chronoLocalDate != null && b0VarC.g != null && (qVar = b0VarC.h) != (qVar2 = j$.time.q.d)) {
                    b0VarC.f = chronoLocalDate.J(qVar);
                    b0VarC.h = qVar2;
                }
                if (b0VarC.g == null && (map.containsKey(j$.time.temporal.a.INSTANT_SECONDS) || map.containsKey(j$.time.temporal.a.SECOND_OF_DAY) || map.containsKey(j$.time.temporal.a.SECOND_OF_MINUTE))) {
                    j$.time.temporal.a aVar4 = j$.time.temporal.a.NANO_OF_SECOND;
                    if (map.containsKey(aVar4)) {
                        long jLongValue3 = ((java.lang.Long) map.get(aVar4)).longValue();
                        map.put(j$.time.temporal.a.MICRO_OF_SECOND, java.lang.Long.valueOf(jLongValue3 / 1000));
                        map.put(j$.time.temporal.a.MILLI_OF_SECOND, java.lang.Long.valueOf(jLongValue3 / j));
                    } else {
                        map.put(aVar4, 0L);
                        map.put(j$.time.temporal.a.MICRO_OF_SECOND, 0L);
                        map.put(j$.time.temporal.a.MILLI_OF_SECOND, 0L);
                    }
                }
                if (b0VarC.f != null && b0VarC.g != null) {
                    java.lang.Long l5 = (java.lang.Long) map.get(j$.time.temporal.a.OFFSET_SECONDS);
                    if (l5 != null) {
                        map.put(j$.time.temporal.a.INSTANT_SECONDS, java.lang.Long.valueOf(b0VarC.f.F(b0VarC.g).A(j$.time.ZoneOffset.Q(l5.intValue())).toEpochSecond()));
                    } else if (b0VarC.b != null) {
                        map.put(j$.time.temporal.a.INSTANT_SECONDS, java.lang.Long.valueOf(b0VarC.f.F(b0VarC.g).A(b0VarC.b).toEpochSecond()));
                    }
                }
                return b0VarC;
            }
        }
        java.lang.String string = charSequence.length() > 64 ? charSequence.subSequence(0, 64).toString() + "..." : charSequence.toString();
        if (parsePosition.getErrorIndex() >= 0) {
            java.lang.String str = "Text '" + string + "' could not be parsed at index " + parsePosition.getErrorIndex();
            parsePosition.getErrorIndex();
            throw new j$.time.format.DateTimeParseException(str, charSequence);
        }
        java.lang.String str2 = "Text '" + string + "' could not be parsed, unparsed text found at index " + parsePosition.getIndex();
        parsePosition.getIndex();
        throw new j$.time.format.DateTimeParseException(str2, charSequence);
    }

    public java.lang.String format(j$.time.temporal.TemporalAccessor temporalAccessor) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(32);
        j$.time.format.d dVar = this.a;
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        j$.util.Objects.requireNonNull(sb, "appendable");
        try {
            dVar.h(new j$.time.format.w(temporalAccessor, this), sb);
            return sb.toString();
        } catch (java.io.IOException e) {
            throw new j$.time.DateTimeException(e.getMessage(), e);
        }
    }

    public <T> T parse(java.lang.CharSequence charSequence, j$.time.temporal.TemporalQuery<T> temporalQuery) {
        j$.util.Objects.requireNonNull(charSequence, "text");
        j$.util.Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) b(charSequence).G(temporalQuery);
        } catch (j$.time.format.DateTimeParseException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            throw a(charSequence, e2);
        }
    }

    public final java.lang.String toString() {
        java.lang.String string = this.a.toString();
        return !string.startsWith("[") ? string.substring(1, string.length() - 1) : string;
    }

    public j$.time.format.DateTimeFormatter withLocale(java.util.Locale locale) {
        if (this.b.equals(locale)) {
            return this;
        }
        return new j$.time.format.DateTimeFormatter(this.a, locale, this.c, this.d, this.e, this.f);
    }

    public j$.time.format.DateTimeFormatter withZone(j$.time.ZoneId zoneId) {
        if (j$.util.Objects.equals(this.f, zoneId)) {
            return this;
        }
        return new j$.time.format.DateTimeFormatter(this.a, this.b, this.c, this.d, this.e, zoneId);
    }

    public j$.time.temporal.TemporalAccessor parse(java.lang.CharSequence charSequence) {
        j$.util.Objects.requireNonNull(charSequence, "text");
        try {
            return b(charSequence);
        } catch (j$.time.format.DateTimeParseException e) {
            throw e;
        } catch (java.lang.RuntimeException e2) {
            throw a(charSequence, e2);
        }
    }
}
