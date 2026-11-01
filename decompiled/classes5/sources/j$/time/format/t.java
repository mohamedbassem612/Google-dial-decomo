package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class t extends j$.time.format.s {
    public static final j$.util.concurrent.ConcurrentHashMap i = new j$.util.concurrent.ConcurrentHashMap();
    public final j$.time.format.TextStyle e;
    public final boolean f;
    public final java.util.HashMap g;
    public final java.util.HashMap h;

    public t(j$.time.format.TextStyle textStyle, boolean z) {
        super(j$.time.temporal.m.e, j$.desugar.sun.nio.fs.h.a("ZoneText(", java.lang.String.valueOf(textStyle), ")"));
        this.g = new java.util.HashMap();
        this.h = new java.util.HashMap();
        this.e = (j$.time.format.TextStyle) j$.util.Objects.requireNonNull(textStyle, "textStyle");
        this.f = z;
    }

    @Override // j$.time.format.s
    public final j$.time.format.m a(j$.time.format.v vVar) {
        j$.time.format.m mVar;
        if (this.e == j$.time.format.TextStyle.NARROW) {
            return super.a(vVar);
        }
        java.util.Locale locale = vVar.a.b;
        boolean z = vVar.b;
        java.util.Set set = j$.time.zone.g.d;
        int size = set.size();
        java.util.HashMap map = z ? this.g : this.h;
        java.util.Map.Entry entry = (java.util.Map.Entry) map.get(locale);
        if (entry != null && ((java.lang.Integer) entry.getKey()).intValue() == size && (mVar = (j$.time.format.m) ((java.lang.ref.SoftReference) entry.getValue()).get()) != null) {
            return mVar;
        }
        j$.time.format.m mVar2 = vVar.b ? new j$.time.format.m("", null, null) : new j$.time.format.l("", null, null);
        for (java.lang.String[] strArr : java.text.DateFormatSymbols.getInstance(locale).getZoneStrings()) {
            java.lang.String str = strArr[0];
            if (set.contains(str)) {
                mVar2.a(str, str);
                java.util.HashMap map2 = j$.time.format.e0.g;
                java.util.HashMap map3 = j$.time.format.e0.d;
                java.lang.String str2 = (java.lang.String) map3.get(str);
                if (str2 == null && map2.containsKey(str)) {
                    str = (java.lang.String) map2.get(str);
                    str2 = (java.lang.String) map3.get(str);
                }
                if (str2 != null) {
                    java.util.Map map4 = (java.util.Map) j$.time.format.e0.f.get(str2);
                    str = (map4 == null || !map4.containsKey(locale.getCountry())) ? (java.lang.String) j$.time.format.e0.e.get(str2) : (java.lang.String) map4.get(locale.getCountry());
                }
                if (map2.containsKey(str)) {
                    str = (java.lang.String) map2.get(str);
                }
                for (int i2 = this.e == j$.time.format.TextStyle.FULL ? 1 : 2; i2 < strArr.length; i2 += 2) {
                    mVar2.a(strArr[i2], str);
                }
            }
        }
        map.put(locale, new java.util.AbstractMap.SimpleImmutableEntry(java.lang.Integer.valueOf(size), new java.lang.ref.SoftReference(mVar2)));
        return mVar2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // j$.time.format.s, j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        boolean zG;
        java.lang.String[] strArr;
        j$.time.ZoneId zoneId = (j$.time.ZoneId) wVar.b(j$.time.temporal.m.a);
        if (zoneId == null) {
            return false;
        }
        java.lang.String strT = zoneId.t();
        if (!(zoneId instanceof j$.time.ZoneOffset)) {
            j$.time.temporal.TemporalAccessor temporalAccessor = wVar.a;
            java.lang.String str = null;
            java.util.Map concurrentHashMap = null;
            if (this.f) {
                zG = 2;
            } else if (temporalAccessor.c(j$.time.temporal.a.INSTANT_SECONDS)) {
                zG = zoneId.getRules().g(j$.time.Instant.from(temporalAccessor));
            } else {
                j$.time.temporal.a aVar = j$.time.temporal.a.EPOCH_DAY;
                if (temporalAccessor.c(aVar)) {
                    j$.time.temporal.a aVar2 = j$.time.temporal.a.NANO_OF_DAY;
                    if (temporalAccessor.c(aVar2)) {
                        j$.time.LocalDateTime localDateTimeB = j$.time.LocalDateTime.B(j$.time.LocalDate.Q(temporalAccessor.D(aVar)), j$.time.j.L(temporalAccessor.D(aVar2)));
                        java.lang.Object objE = zoneId.getRules().e(localDateTimeB);
                        if ((objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null) == null) {
                            zG = zoneId.getRules().g(j$.time.ZonedDateTime.t(localDateTimeB, zoneId, null).toInstant());
                        } else {
                            zG = 2;
                        }
                    } else {
                        zG = 2;
                    }
                } else {
                    zG = 2;
                }
            }
            java.util.Locale locale = wVar.b.b;
            j$.time.format.TextStyle textStyle = j$.time.format.TextStyle.NARROW;
            j$.time.format.TextStyle textStyle2 = this.e;
            if (textStyle2 != textStyle) {
                j$.util.concurrent.ConcurrentHashMap concurrentHashMap2 = i;
                java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) concurrentHashMap2.get(strT);
                if (softReference == null || (concurrentHashMap = (java.util.Map) softReference.get()) == null || (strArr = (java.lang.String[]) concurrentHashMap.get(locale)) == null) {
                    java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(strT);
                    java.lang.String[] strArr2 = {strT, timeZone.getDisplayName(false, 1, locale), timeZone.getDisplayName(false, 0, locale), timeZone.getDisplayName(true, 1, locale), timeZone.getDisplayName(true, 0, locale), strT, strT};
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new j$.util.concurrent.ConcurrentHashMap();
                    }
                    concurrentHashMap.put(locale, strArr2);
                    concurrentHashMap2.put(strT, new java.lang.ref.SoftReference(concurrentHashMap));
                    strArr = strArr2;
                }
                if (zG != 0) {
                    str = zG != 1 ? strArr[(textStyle2.a ? 1 : 0) + 5] : strArr[(textStyle2.a ? 1 : 0) + 3];
                } else {
                    str = strArr[(textStyle2.a ? 1 : 0) + 1];
                }
            }
            if (str != null) {
                strT = str;
            }
        }
        sb.append(strT);
        return true;
    }
}
