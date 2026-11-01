package j$.com.android.tools.r8;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ int B(long j) {
        int i = (int) j;
        if (j == i) {
            return i;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long C(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) == 0 || (((j ^ j2) >> 63) | 1) >= 0) ? j3 : j3 - 1;
    }

    public static /* synthetic */ java.lang.String D(java.util.Collection collection) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.Iterator it = collection.iterator();
        if (it.hasNext()) {
            while (true) {
                sb.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb.append((java.lang.CharSequence) "/");
            }
        }
        return sb.toString();
    }

    public static /* synthetic */ java.util.AbstractMap.SimpleImmutableEntry E(java.lang.String str, java.lang.String str2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(str), j$.util.Objects.requireNonNull(str2));
    }

    public static /* synthetic */ java.util.List F(java.lang.Object[] objArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(objArr.length);
        for (java.lang.Object obj : objArr) {
            arrayList.add(j$.util.Objects.requireNonNull(obj));
        }
        return j$.util.DesugarCollections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ java.util.Set G(java.lang.Object[] objArr) {
        java.util.HashSet hashSet = new java.util.HashSet(objArr.length);
        for (java.lang.Object obj : objArr) {
            if (!hashSet.add(j$.util.Objects.requireNonNull(obj))) {
                throw new java.lang.IllegalArgumentException("duplicate element: " + obj);
            }
        }
        return j$.util.DesugarCollections.unmodifiableSet(hashSet);
    }

    public static /* synthetic */ boolean H(java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.Object obj, java.lang.Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean I(sun.misc.Unsafe unsafe, java.lang.Object obj, long j, java.lang.Object obj2, java.lang.Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
            if (unsafe.getObject(obj, j) != obj2) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ j$.nio.file.attribute.FileAttribute[] J(java.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        j$.nio.file.attribute.FileAttribute[] fileAttributeArr2 = new j$.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            fileAttributeArr2[i] = j$.nio.file.attribute.t.a(fileAttributeArr[i]);
        }
        return fileAttributeArr2;
    }

    public static /* synthetic */ java.nio.file.CopyOption[] K(j$.nio.file.CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption copyOptionD;
        if (copyOptionArr == null) {
            return null;
        }
        int length = copyOptionArr.length;
        java.nio.file.CopyOption[] copyOptionArr2 = new java.nio.file.CopyOption[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.CopyOption copyOption = copyOptionArr[i];
            if (copyOption == null) {
                copyOptionD = null;
            } else if (copyOption instanceof j$.nio.file.c) {
                copyOptionD = ((j$.nio.file.c) copyOption).a;
            } else if (copyOption instanceof j$.nio.file.LinkOption) {
                copyOptionD = j$.nio.file.a.c((j$.nio.file.LinkOption) copyOption);
            } else {
                copyOptionD = copyOption instanceof j$.nio.file.StandardCopyOption ? j$.nio.file.a.d((j$.nio.file.StandardCopyOption) copyOption) : new j$.nio.file.d(copyOption);
            }
            copyOptionArr2[i] = copyOptionD;
        }
        return copyOptionArr2;
    }

    public static java.nio.file.attribute.FileAttribute[] L(j$.nio.file.attribute.FileAttribute[] fileAttributeArr) {
        java.nio.file.attribute.FileAttribute qVar;
        if (fileAttributeArr == null) {
            return null;
        }
        int length = fileAttributeArr.length;
        java.nio.file.attribute.FileAttribute[] fileAttributeArr2 = new java.nio.file.attribute.FileAttribute[length];
        for (int i = 0; i < length; i++) {
            j$.nio.file.attribute.FileAttribute fileAttribute = fileAttributeArr[i];
            if (fileAttribute == null) {
                qVar = null;
            } else if (j$.nio.file.attribute.t.d(fileAttribute.value())) {
                qVar = new j$.nio.file.attribute.s(fileAttribute);
            } else {
                qVar = fileAttribute instanceof j$.nio.file.attribute.p ? ((j$.nio.file.attribute.p) fileAttribute).a : new j$.nio.file.attribute.q(fileAttribute);
            }
            fileAttributeArr2[i] = qVar;
        }
        return fileAttributeArr2;
    }

    public static /* synthetic */ long M(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) <= 0 ? j3 + j2 : j3;
    }

    public static /* synthetic */ long N(long j, long j2) {
        long j3 = j + j2;
        if ((((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long O(long j, long j2) {
        int iNumberOfLeadingZeros = java.lang.Long.numberOfLeadingZeros(~j2) + java.lang.Long.numberOfLeadingZeros(j2) + java.lang.Long.numberOfLeadingZeros(~j) + java.lang.Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if ((((i ^ (-1)) >>> 31) | (j2 != Long.MIN_VALUE ? 1 : 0)) != 0) {
                long j3 = j * j2;
                if (i == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new java.lang.ArithmeticException();
    }

    public static /* synthetic */ long P(long j, long j2) {
        long j3 = j - j2;
        if (((((j2 ^ j) > 0L ? 1 : ((j2 ^ j) == 0L ? 0 : -1)) ^ (-1)) | (((j ^ j3) > 0L ? 1 : ((j ^ j3) == 0L ? 0 : -1)) ^ (-1))) < 0) {
            return j3;
        }
        throw new java.lang.ArithmeticException();
    }

    public static java.lang.String Q(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string;
        java.lang.String string2;
        java.lang.String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new java.lang.String(cArr);
    }

    public static char R(java.lang.String str, int i) {
        if (i < str.length()) {
            return str.charAt(i);
        }
        return (char) 0;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.c] */
    public static j$.util.function.c a(final java.util.function.DoubleConsumer doubleConsumer, final java.util.function.DoubleConsumer doubleConsumer2) {
        j$.util.Objects.requireNonNull(doubleConsumer2);
        return new java.util.function.DoubleConsumer() { // from class: j$.util.function.c
            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }

            public final /* synthetic */ java.util.function.DoubleConsumer andThen(java.util.function.DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.a(this, doubleConsumer3);
            }
        };
    }

    public static int b(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.chrono.ChronoLocalDate chronoLocalDate2) {
        int iCompare = java.lang.Long.compare(chronoLocalDate.E(), chronoLocalDate2.E());
        if (iCompare != 0) {
            return iCompare;
        }
        return chronoLocalDate.getChronology().C().compareTo(chronoLocalDate2.getChronology().C());
    }

    public static int c(j$.time.chrono.d dVar, j$.time.chrono.d dVar2) {
        int iM = dVar.toLocalDate().M(dVar2.toLocalDate());
        if (iM != 0) {
            return iM;
        }
        int iR = dVar.toLocalTime().compareTo(dVar2.toLocalTime());
        if (iR != 0) {
            return iR;
        }
        return dVar.getChronology().C().compareTo(dVar2.getChronology().C());
    }

    public static int d(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime, j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = java.lang.Long.compare(chronoZonedDateTime.toEpochSecond(), chronoZonedDateTime2.toEpochSecond());
        if (iCompare != 0) {
            return iCompare;
        }
        int i = chronoZonedDateTime.toLocalTime().d - chronoZonedDateTime2.toLocalTime().d;
        if (i != 0) {
            return i;
        }
        int I = chronoZonedDateTime.toLocalDateTime().I(chronoZonedDateTime2.toLocalDateTime());
        if (I != 0) {
            return I;
        }
        int iCompareTo = chronoZonedDateTime.getZone().t().compareTo(chronoZonedDateTime2.getZone().t());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return chronoZonedDateTime.getChronology().C().compareTo(chronoZonedDateTime2.getChronology().C());
    }

    public static void e(j$.util.p0 p0Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            p0Var.forEachRemaining((java.util.function.DoubleConsumer) consumer);
        } else {
            if (j$.util.n1.a) {
                j$.util.n1.a(p0Var.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            j$.util.Objects.requireNonNull(consumer);
            p0Var.forEachRemaining((java.util.function.DoubleConsumer) new j$.util.z(consumer, (byte) 0));
        }
    }

    public static void f(j$.util.Spliterator.OfInt ofInt, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            ofInt.forEachRemaining((java.util.function.IntConsumer) consumer);
        } else {
            if (j$.util.n1.a) {
                j$.util.n1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            j$.util.Objects.requireNonNull(consumer);
            ofInt.forEachRemaining((java.util.function.IntConsumer) new j$.util.d0(consumer, (byte) 0));
        }
    }

    public static void g(j$.util.Spliterator.OfLong ofLong, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            ofLong.forEachRemaining((java.util.function.LongConsumer) consumer);
        } else {
            if (j$.util.n1.a) {
                j$.util.n1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            j$.util.Objects.requireNonNull(consumer);
            ofLong.forEachRemaining((java.util.function.LongConsumer) new j$.util.h0(consumer, (byte) 0));
        }
    }

    public static int h(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.l lVar) {
        if (!(lVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.m.a(chronoZonedDateTime, lVar);
        }
        int i = j$.time.chrono.h.a[((j$.time.temporal.a) lVar).ordinal()];
        if (i != 1) {
            return i != 2 ? chronoZonedDateTime.toLocalDateTime().h(lVar) : chronoZonedDateTime.getOffset().getTotalSeconds();
        }
        j$.time.g.f("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
        return 0;
    }

    public static int i(j$.time.chrono.k kVar, j$.time.temporal.a aVar) {
        return aVar == j$.time.temporal.a.ERA ? kVar.getValue() : j$.time.temporal.m.a(kVar, aVar);
    }

    public static long j(j$.time.chrono.k kVar, j$.time.temporal.l lVar) {
        if (lVar == j$.time.temporal.a.ERA) {
            return kVar.getValue();
        }
        if (!(lVar instanceof j$.time.temporal.a)) {
            return lVar.l(kVar);
        }
        j$.time.g.f("Unsupported field: ".concat(java.lang.String.valueOf(lVar)));
        return 0L;
    }

    public static boolean k(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) lVar).isDateBased();
        }
        return lVar != null && lVar.h(chronoLocalDate);
    }

    public static boolean l(j$.time.chrono.k kVar, j$.time.temporal.l lVar) {
        if (lVar instanceof j$.time.temporal.a) {
            if (lVar != j$.time.temporal.a.ERA) {
                return false;
            }
        } else if (lVar == null || !lVar.h(kVar)) {
            return false;
        }
        return true;
    }

    public static java.lang.Object m(j$.time.chrono.ChronoLocalDate chronoLocalDate, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.a || temporalQuery == j$.time.temporal.m.e || temporalQuery == j$.time.temporal.m.d || temporalQuery == j$.time.temporal.m.g) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.m.b) {
            return chronoLocalDate.getChronology();
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.DAYS : temporalQuery.queryFrom(chronoLocalDate);
    }

    public static java.lang.Object n(j$.time.chrono.d dVar, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.a || temporalQuery == j$.time.temporal.m.e || temporalQuery == j$.time.temporal.m.d) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.m.g) {
            return dVar.toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.m.b) {
            return dVar.getChronology();
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.NANOS : temporalQuery.queryFrom(dVar);
    }

    public static java.lang.Object o(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime, j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.e || temporalQuery == j$.time.temporal.m.a) {
            return chronoZonedDateTime.getZone();
        }
        if (temporalQuery == j$.time.temporal.m.d) {
            return chronoZonedDateTime.getOffset();
        }
        if (temporalQuery == j$.time.temporal.m.g) {
            return chronoZonedDateTime.toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.m.b) {
            return chronoZonedDateTime.getChronology();
        }
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.NANOS : temporalQuery.queryFrom(chronoZonedDateTime);
    }

    public static java.lang.Object p(j$.time.chrono.k kVar, j$.time.temporal.TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.m.c ? j$.time.temporal.ChronoUnit.ERAS : j$.time.temporal.m.c(kVar, temporalQuery);
    }

    public static long q(j$.time.chrono.d dVar, j$.time.ZoneOffset zoneOffset) {
        j$.util.Objects.requireNonNull(zoneOffset, "offset");
        return ((dVar.toLocalDate().E() * 86400) + ((long) dVar.toLocalTime().U())) - ((long) zoneOffset.getTotalSeconds());
    }

    public static long r(j$.time.chrono.ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.toLocalDate().E() * 86400) + ((long) chronoZonedDateTime.toLocalTime().U())) - ((long) chronoZonedDateTime.getOffset().getTotalSeconds());
    }

    public static boolean s(j$.util.p0 p0Var, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.DoubleConsumer) {
            return p0Var.tryAdvance((java.util.function.DoubleConsumer) consumer);
        }
        if (j$.util.n1.a) {
            j$.util.n1.a(p0Var.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        return p0Var.tryAdvance((java.util.function.DoubleConsumer) new j$.util.z(consumer, (byte) 0));
    }

    public static boolean t(j$.util.Spliterator.OfInt ofInt, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.IntConsumer) {
            return ofInt.tryAdvance((java.util.function.IntConsumer) consumer);
        }
        if (j$.util.n1.a) {
            j$.util.n1.a(ofInt.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        return ofInt.tryAdvance((java.util.function.IntConsumer) new j$.util.d0(consumer, (byte) 0));
    }

    public static boolean u(j$.util.Spliterator.OfLong ofLong, java.util.function.Consumer consumer) {
        if (consumer instanceof java.util.function.LongConsumer) {
            return ofLong.tryAdvance((java.util.function.LongConsumer) consumer);
        }
        if (j$.util.n1.a) {
            j$.util.n1.a(ofLong.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        j$.util.Objects.requireNonNull(consumer);
        return ofLong.tryAdvance((java.util.function.LongConsumer) new j$.util.h0(consumer, (byte) 0));
    }

    public static java.lang.String v(long j, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(2016, 1, (int) j, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static java.lang.String w(long j, java.lang.String str, java.util.Locale locale) {
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone("UTC");
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeZone(timeZone);
        calendar.set(0, (int) j, 0, 0, 0, 0);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static void x(java.util.Iterator it, java.util.function.Consumer consumer) {
        if (it instanceof j$.util.w) {
            ((j$.util.w) it).forEachRemaining(consumer);
            return;
        }
        j$.util.Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static j$.time.chrono.a y(j$.time.temporal.TemporalAccessor temporalAccessor) {
        j$.util.Objects.requireNonNull(temporalAccessor, "temporal");
        java.lang.Object objRequireNonNull = (j$.time.chrono.a) temporalAccessor.G(j$.time.temporal.m.b);
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        if (objRequireNonNull == null) {
            objRequireNonNull = j$.util.Objects.requireNonNull(qVar, "defaultObj");
        }
        return (j$.time.chrono.a) objRequireNonNull;
    }

    public abstract j$.nio.file.attribute.t0 A(java.lang.String str);

    public final int characteristics() {
        return 16448;
    }

    public final long estimateSize() {
        return 0L;
    }

    public final void forEachRemaining(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
    }

    public final boolean tryAdvance(java.lang.Object obj) {
        j$.util.Objects.requireNonNull(obj);
        return false;
    }

    public final j$.util.Spliterator trySplit() {
        return null;
    }

    public abstract j$.nio.file.attribute.g0 z(java.lang.String str);
}
