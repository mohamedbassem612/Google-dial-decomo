package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class r extends j$.time.format.i {
    public final char g;
    public final int h;

    public r(char c, int i, int i2, int i3, int i4) {
        super(null, i2, i3, j$.time.format.d0.NOT_NEGATIVE, i4);
        this.g = c;
        this.h = i;
    }

    @Override // j$.time.format.i
    public final j$.time.format.i d() {
        if (this.e == -1) {
            return this;
        }
        return new j$.time.format.r(this.g, this.h, this.b, this.c, -1);
    }

    @Override // j$.time.format.i
    public final j$.time.format.i e(int i) {
        return new j$.time.format.r(this.g, this.h, this.b, this.c, this.e + i);
    }

    public final j$.time.format.i f(java.util.Locale locale) {
        j$.time.temporal.p pVar;
        j$.util.concurrent.ConcurrentHashMap concurrentHashMap = j$.time.temporal.q.g;
        j$.util.Objects.requireNonNull(locale, "locale");
        java.util.Calendar calendar = java.util.Calendar.getInstance(new java.util.Locale(locale.getLanguage(), locale.getCountry()));
        j$.time.temporal.q qVarA = j$.time.temporal.q.a(j$.time.DayOfWeek.a[((((int) (((long) (calendar.getFirstDayOfWeek() - 1)) % 7)) + 7) + j$.time.DayOfWeek.SUNDAY.ordinal()) % 7], calendar.getMinimalDaysInFirstWeek());
        char c = this.g;
        if (c == 'W') {
            pVar = qVarA.d;
        } else {
            if (c == 'Y') {
                j$.time.temporal.p pVar2 = qVarA.f;
                int i = this.h;
                if (i == 2) {
                    return new j$.time.format.o(pVar2, 2, 2, j$.time.format.o.h, this.e);
                }
                return new j$.time.format.i(pVar2, i, 19, i < 4 ? j$.time.format.d0.NORMAL : j$.time.format.d0.EXCEEDS_PAD, this.e);
            }
            if (c == 'c' || c == 'e') {
                pVar = qVarA.c;
            } else {
                if (c != 'w') {
                    throw new java.lang.IllegalStateException("unreachable");
                }
                pVar = qVarA.e;
            }
        }
        return new j$.time.format.i(pVar, this.b, this.c, j$.time.format.d0.NOT_NEGATIVE, this.e);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        return f(wVar.b.b).h(wVar, sb);
    }

    @Override // j$.time.format.i, j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        return f(vVar.a.b).k(vVar, charSequence, i);
    }

    @Override // j$.time.format.i
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(30);
        sb.append("Localized(");
        int i = this.h;
        char c = this.g;
        if (c != 'Y') {
            if (c == 'W') {
                sb.append("WeekOfMonth");
            } else if (c == 'c' || c == 'e') {
                sb.append("DayOfWeek");
            } else if (c == 'w') {
                sb.append("WeekOfWeekBasedYear");
            }
            sb.append(",");
            sb.append(i);
        } else if (i == 1) {
            sb.append("WeekBasedYear");
        } else if (i == 2) {
            sb.append("ReducedValue(WeekBasedYear,2,2,2000-01-01)");
        } else {
            sb.append("WeekBasedYear,");
            sb.append(i);
            sb.append(",19,");
            sb.append(i < 4 ? j$.time.format.d0.NORMAL : j$.time.format.d0.EXCEEDS_PAD);
        }
        sb.append(")");
        return sb.toString();
    }
}
