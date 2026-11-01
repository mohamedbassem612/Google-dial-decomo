package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kqs {
    public static final /* synthetic */ int a = 0;
    private static final aorg b = new aorg("\\s+");
    private static final aopq c = new aopq(1, 31);

    /* JADX WARN: Code duplicated, block: B:43:0x010e  */
    public static final alcf a(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        defpackage.kqo kqoVarC;
        alcf alcfVarH;
        java.lang.String str;
        j$.time.DayOfWeek dayOfWeek;
        j$.time.DayOfWeek dayOfWeek2;
        defpackage.kqo kqoVar2 = kqoVar;
        boolean z = false;
        if (!kqqVar.e() || (str = kqoVar2.g) == null || kqoVar2.i != null || kqoVar2.j != null || kqoVar2.k != null) {
            kqoVarC = kqoVar;
            break;
        }
        java.util.Locale locale = java.util.Locale.ROOT;
        aooh.e(locale, "ROOT");
        java.lang.String lowerCase = str.toLowerCase(locale);
        aooh.e(lowerCase, "toLowerCase(...)");
        java.lang.String strB = b.b(lowerCase, " ");
        j$.time.DayOfWeek[] dayOfWeekArrValues = j$.time.DayOfWeek.values();
        int length = dayOfWeekArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                dayOfWeek = null;
                break;
            }
            dayOfWeek = dayOfWeekArrValues[i];
            java.lang.String strName = dayOfWeek.name();
            java.util.Locale locale2 = java.util.Locale.ROOT;
            aooh.e(locale2, "ROOT");
            java.lang.String lowerCase2 = strName.toLowerCase(locale2);
            aooh.e(lowerCase2, "toLowerCase(...)");
            if (aoov.G(strB, "next ".concat(java.lang.String.valueOf(lowerCase2)), false)) {
                break;
            }
            i++;
        }
        if (dayOfWeek != null && dayOfWeek.getValue() > zonedDateTime.getDayOfWeek().getValue() && dayOfWeek.getValue() <= zonedDateTime.getDayOfWeek().getValue() + 2 && ((dayOfWeek2 = kqoVar2.h) == null || dayOfWeek2 == dayOfWeek)) {
            j$.time.LocalDate localDate = zonedDateTime.plusWeeks(1L).with(j$.time.temporal.TemporalAdjusters.nextOrSame(dayOfWeek)).toLocalDate();
            aooh.e(localDate, "toLocalDate(...)");
            kqoVarC = kqoVar2.a(localDate);
        } else if (kqoVar2.h == null) {
            if (!aoov.G(strB, "today", false)) {
                if (!aoov.G(strB, "tomorrow", false)) {
                    aojl aojlVar = new aojl(defpackage.kqr.a);
                    while (true) {
                        if (!aojlVar.hasNext()) {
                            kqoVarC = kqoVar;
                            break;
                        }
                        j$.time.DayOfWeek dayOfWeek3 = (j$.time.DayOfWeek) aojlVar.next();
                        java.lang.String strName2 = dayOfWeek3.name();
                        java.util.Locale locale3 = java.util.Locale.ROOT;
                        aooh.e(locale3, "ROOT");
                        java.lang.String lowerCase3 = strName2.toLowerCase(locale3);
                        aooh.e(lowerCase3, "toLowerCase(...)");
                        if (aoov.G(strB, lowerCase3, false)) {
                            kqoVarC = defpackage.kqo.c(kqoVar2, dayOfWeek3, null, null, null, 125);
                            break;
                        }
                        kqoVar2 = kqoVar;
                    }
                } else {
                    j$.time.LocalDate localDate2 = zonedDateTime.plusDays(1L).toLocalDate();
                    aooh.e(localDate2, "toLocalDate(...)");
                    kqoVarC = kqoVar2.a(localDate2);
                }
            } else {
                j$.time.LocalDate localDate3 = zonedDateTime.toLocalDate();
                aooh.e(localDate3, "toLocalDate(...)");
                kqoVarC = kqoVar2.a(localDate3);
            }
        } else {
            kqoVarC = kqoVar;
            break;
        }
        java.lang.Integer num = kqoVarC.i;
        boolean z2 = num != null;
        boolean z3 = kqoVarC.j != null;
        java.lang.Integer num2 = kqoVarC.k;
        boolean z4 = num2 != null;
        j$.time.DayOfWeek dayOfWeek4 = kqoVarC.h;
        boolean z5 = dayOfWeek4 != null;
        boolean z6 = (z2 || z3 || z4 || z5) ? false : true;
        boolean z7 = (z2 || z3 || z4 || !z5) ? false : true;
        boolean z8 = (!z2 || z3 || z4 || z5) ? false : true;
        boolean z9 = (z2 || !z3 || z4 || z5) ? false : true;
        boolean z10 = (z2 || z3 || !z4 || z5) ? false : true;
        boolean z11 = z2 && z3 && !z4 && !z5;
        boolean z12 = z2 && !z3 && z4 && !z5;
        boolean z13 = !z2 && z3 && z4 && !z5;
        boolean z14 = z2 && !z3 && !z4 && z5;
        boolean z15 = !z2 && z3 && !z4 && z5;
        boolean z16 = !z2 && !z3 && z4 && z5;
        boolean z17 = z2 && z3 && z4 && !z5;
        boolean z18 = z2 && z3 && !z4 && z5;
        boolean z19 = z2 && !z3 && z4 && z5;
        boolean z20 = !z2 && z3 && z4 && z5;
        if (z2 && z3 && z4 && z5) {
            z = true;
        }
        if (z6) {
            return n(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z7) {
            return j(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z8) {
            return k(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z9) {
            return l(d(kqoVarC, zonedDateTime), zonedDateTime, kqqVar);
        }
        if (z10) {
            return b(kqoVarC, zonedDateTime) ? n(defpackage.kqo.c(kqoVarC, null, null, null, null, 111), zonedDateTime, kqqVar) : h(defpackage.kqo.c(kqoVarC, null, 1, 1, null, 115), zonedDateTime, kqqVar);
        }
        if (z11) {
            return f(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z12) {
            return g(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z13) {
            return l(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z14) {
            return e(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z15) {
            return m(d(kqoVarC, zonedDateTime), zonedDateTime, kqqVar);
        }
        if (z16) {
            if (num2 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            if (dayOfWeek4 == null) {
                throw new java.lang.IllegalStateException("Required value was null.");
            }
            if (b(kqoVarC, zonedDateTime)) {
                return j(defpackage.kqo.c(kqoVarC, null, null, null, null, 111), zonedDateTime, kqqVar);
            }
            j$.time.LocalDate localDateWith = j$.time.LocalDate.of(num2.intValue(), 1, 1).with(j$.time.temporal.TemporalAdjusters.nextOrSame(dayOfWeek4));
            aooh.c(localDateWith);
            return h(kqoVarC.a(localDateWith), zonedDateTime, kqqVar);
        }
        if (z17) {
            return h(kqoVarC, zonedDateTime, kqqVar);
        }
        if (z18) {
            return f(defpackage.kqo.c(kqoVarC, null, null, null, null, 125), zonedDateTime, kqqVar);
        }
        if (!z19) {
            if (z20) {
                return m(kqoVarC, zonedDateTime, kqqVar);
            }
            if (z) {
                return i(kqoVarC, zonedDateTime, kqqVar);
            }
            java.util.Objects.toString(kqoVarC);
            throw new java.lang.IllegalArgumentException("Unsupported partial time state: ".concat(kqoVarC.toString()));
        }
        if (num2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        if (num == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        if (dayOfWeek4 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        if (num2.intValue() < zonedDateTime.getYear()) {
            return e(defpackage.kqo.c(kqoVarC, null, null, null, null, 111), zonedDateTime, kqqVar);
        }
        j$.time.LocalDate localDatePlusDays = zonedDateTime.toLocalDate().plusDays(1L);
        aooh.e(localDatePlusDays, "plusDays(...)");
        j$.time.LocalDate localDateC = c(localDatePlusDays, num.intValue(), dayOfWeek4, num2, kqqVar.b().toDays());
        return (localDateC == null || (alcfVarH = h(kqoVarC.a(localDateC), zonedDateTime, kqqVar)) == null) ? g(defpackage.kqo.c(kqoVarC, null, null, null, null, 125), zonedDateTime, kqqVar) : alcfVarH;
    }

    private static final boolean b(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime) {
        java.lang.Integer num;
        java.lang.Integer num2 = kqoVar.j;
        if (num2 == null || (num = kqoVar.k) == null || kqoVar.i != null) {
            java.lang.Integer num3 = kqoVar.k;
            if (num3 == null || num2 != null) {
                java.util.Objects.toString(kqoVar);
                throw new java.lang.IllegalArgumentException("Unsupported partial time state for comparison. Partial time: ".concat(kqoVar.toString()));
            }
            if (num3.intValue() > zonedDateTime.getYear()) {
                return false;
            }
        } else if (j$.time.LocalDate.of(num.intValue(), num2.intValue(), 1).isAfter(zonedDateTime.toLocalDate().withDayOfMonth(1))) {
            return false;
        }
        return true;
    }

    private static final j$.time.LocalDate c(j$.time.LocalDate localDate, int i, j$.time.DayOfWeek dayOfWeek, java.lang.Integer num, long j) {
        java.lang.Object next;
        aoqu aoquVar = new aoqu(new aoqt(ajsz.ch(j <= Long.MIN_VALUE ? aops.c : new aops(0L, j - 1)), new defpackage.jpi(localDate, 18), 2));
        while (aoquVar.hasNext()) {
            next = aoquVar.next();
            j$.time.LocalDate localDate2 = (j$.time.LocalDate) next;
            if (localDate2.getDayOfWeek() == dayOfWeek && localDate2.getDayOfMonth() == i && (num == null || localDate2.getYear() == num.intValue())) {
                return (j$.time.LocalDate) next;
            }
        }
        next = null;
        return (j$.time.LocalDate) next;
    }

    private static final defpackage.kqo d(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime) {
        java.lang.Integer num = kqoVar.j;
        if (num != null) {
            return defpackage.kqo.c(kqoVar, null, null, null, java.lang.Integer.valueOf(num.intValue() >= zonedDateTime.getMonthValue() ? zonedDateTime.getYear() : zonedDateTime.getYear() + 1), 111);
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    private static final alcf e(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        alcf alcfVarH;
        java.lang.Integer num = kqoVar.i;
        if (num == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        j$.time.DayOfWeek dayOfWeek = kqoVar.h;
        if (dayOfWeek == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        j$.time.LocalDate localDatePlusDays = zonedDateTime.toLocalDate().plusDays(1L);
        aooh.e(localDatePlusDays, "plusDays(...)");
        j$.time.LocalDate localDateC = c(localDatePlusDays, num.intValue(), dayOfWeek, null, kqqVar.b().toDays());
        return (localDateC == null || (alcfVarH = h(kqoVar.a(localDateC), zonedDateTime, kqqVar)) == null) ? k(defpackage.kqo.c(kqoVar, null, null, null, null, 125), zonedDateTime, kqqVar) : alcfVarH;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    private static final alcf f(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        int year;
        java.lang.Integer num = kqoVar.j;
        if (num == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        java.lang.Integer num2 = kqoVar.i;
        if (num2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        if (num.intValue() <= zonedDateTime.getMonthValue()) {
            if (num.intValue() != zonedDateTime.getMonthValue() || num2.intValue() < zonedDateTime.getDayOfMonth()) {
                year = zonedDateTime.getYear() + 1;
            } else {
                year = zonedDateTime.getYear();
            }
        } else {
            year = zonedDateTime.getYear();
        }
        return h(defpackage.kqo.c(kqoVar, null, null, null, java.lang.Integer.valueOf(year), 111), zonedDateTime, kqqVar);
    }

    private static final alcf g(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        return b(kqoVar, zonedDateTime) ? k(defpackage.kqo.c(kqoVar, null, null, null, null, 111), zonedDateTime, kqqVar) : h(defpackage.kqo.c(kqoVar, null, null, 1, null, 119), zonedDateTime, kqqVar);
    }

    private static final alcf h(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        j$.time.ZonedDateTime zonedDateTimeD = kqqVar.d(kqoVar, zonedDateTime);
        j$.time.Instant instant = zonedDateTimeD.withMinute((zonedDateTimeD.getMinute() / 5) * 5).withSecond(0).withNano(0).toInstant();
        akzx akzxVarM = alcf.a.m();
        long epochSecond = instant.getEpochSecond();
        akzxVarM.u();
        akzxVarM.b.b = epochSecond;
        int nano = instant.getNano();
        akzxVarM.u();
        akzxVarM.b.c = nano;
        alcf alcfVarP = akzxVarM.p();
        aooh.e(alcfVarP, "build(...)");
        return alcfVarP;
    }

    private static final alcf i(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        return h(defpackage.kqo.c(kqoVar, null, null, null, null, 125), zonedDateTime, kqqVar);
    }

    private static final alcf j(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        j$.time.DayOfWeek dayOfWeek = kqoVar.h;
        if (dayOfWeek == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        j$.time.LocalDate localDate = zonedDateTime.with(j$.time.temporal.TemporalAdjusters.next(dayOfWeek)).toLocalDate();
        aooh.c(localDate);
        return h(kqoVar.a(localDate), zonedDateTime, kqqVar);
    }

    private static final alcf k(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        java.lang.Integer num = kqoVar.i;
        if (num == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        j$.time.ZonedDateTime zonedDateTimePlus = zonedDateTime.plus(kqqVar.c());
        aooh.e(zonedDateTimePlus, "plus(...)");
        int iIntValue = num.intValue();
        aopq aopqVar = c;
        int i = ((aopo) aopqVar).a;
        if (iIntValue > ((aopo) aopqVar).b || i > iIntValue) {
            java.util.Objects.toString(aopqVar);
            throw new java.lang.IllegalArgumentException("Requested day of month is out of range ".concat(java.lang.String.valueOf(aopqVar)));
        }
        java.util.Iterator itA = aooc.h(zonedDateTimePlus, new defpackage.kbz(11)).a();
        while (itA.hasNext()) {
            j$.time.ZonedDateTime zonedDateTime2 = (j$.time.ZonedDateTime) itA.next();
            if (zonedDateTime2.getDayOfMonth() == iIntValue) {
                j$.time.LocalDate localDate = zonedDateTime2.toLocalDate();
                aooh.c(localDate);
                return h(kqoVar.a(localDate), zonedDateTime, kqqVar);
            }
        }
        throw new java.util.NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    private static final alcf l(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        return b(kqoVar, zonedDateTime) ? n(defpackage.kqo.c(kqoVar, null, null, null, null, 103), zonedDateTime, kqqVar) : h(defpackage.kqo.c(kqoVar, null, 1, null, null, 123), zonedDateTime, kqqVar);
    }

    private static final alcf m(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        java.lang.Integer num = kqoVar.k;
        if (num == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        java.lang.Integer num2 = kqoVar.j;
        if (num2 == null) {
            throw new java.lang.IllegalStateException("Required value was null.");
        }
        j$.time.DayOfWeek dayOfWeek = kqoVar.h;
        if (dayOfWeek != null) {
            return b(kqoVar, zonedDateTime) ? j(defpackage.kqo.c(kqoVar, null, null, null, null, 103), zonedDateTime, kqqVar) : i(defpackage.kqo.c(kqoVar, null, java.lang.Integer.valueOf(j$.time.LocalDate.of(num.intValue(), num2.intValue(), 1).with(j$.time.temporal.TemporalAdjusters.nextOrSame(dayOfWeek)).getDayOfMonth()), null, null, 123), zonedDateTime, kqqVar);
        }
        throw new java.lang.IllegalStateException("Required value was null.");
    }

    private static final alcf n(defpackage.kqo kqoVar, j$.time.ZonedDateTime zonedDateTime, defpackage.kqq kqqVar) {
        return h(kqqVar.a(kqoVar, zonedDateTime), zonedDateTime, kqqVar);
    }
}
