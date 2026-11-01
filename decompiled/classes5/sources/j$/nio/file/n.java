package j$.nio.file;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class n implements j$.time.temporal.TemporalAccessor {
    public final /* synthetic */ byte a;
    public final java.lang.Comparable b;
    public final java.lang.Object c;
    public final java.lang.Object d;
    public final java.io.Serializable e;

    public /* synthetic */ n(java.lang.Comparable comparable, java.lang.Object obj, java.lang.Object obj2, java.io.Serializable serializable, byte b) {
        this.a = b;
        this.b = comparable;
        this.c = obj;
        this.d = obj2;
        this.e = serializable;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long D(j$.time.temporal.l lVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = (j$.time.chrono.ChronoLocalDate) this.b;
        return (chronoLocalDate == null || !lVar.isDateBased()) ? ((j$.time.temporal.TemporalAccessor) this.c).D(lVar) : chronoLocalDate.D(lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final java.lang.Object G(j$.time.temporal.TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.m.b) {
            return (j$.time.chrono.a) this.d;
        }
        if (temporalQuery == j$.time.temporal.m.a) {
            return (j$.time.ZoneId) this.e;
        }
        return temporalQuery == j$.time.temporal.m.c ? ((j$.time.temporal.TemporalAccessor) this.c).G(temporalQuery) : temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean c(j$.time.temporal.l lVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = (j$.time.chrono.ChronoLocalDate) this.b;
        return (chronoLocalDate == null || !lVar.isDateBased()) ? ((j$.time.temporal.TemporalAccessor) this.c).c(lVar) : chronoLocalDate.c(lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int h(j$.time.temporal.l lVar) {
        return j$.time.temporal.m.a(this, lVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o l(j$.time.temporal.l lVar) {
        j$.time.chrono.ChronoLocalDate chronoLocalDate = (j$.time.chrono.ChronoLocalDate) this.b;
        return (chronoLocalDate == null || !lVar.isDateBased()) ? ((j$.time.temporal.TemporalAccessor) this.c).l(lVar) : chronoLocalDate.l(lVar);
    }

    public final java.lang.String toString() {
        switch (this.a) {
            case 1:
                java.lang.String strValueOf = java.lang.String.valueOf((j$.time.temporal.TemporalAccessor) this.c);
                j$.time.chrono.a aVar = (j$.time.chrono.a) this.d;
                java.lang.String strConcat = aVar != null ? " with chronology ".concat(java.lang.String.valueOf(aVar)) : "";
                j$.time.ZoneId zoneId = (j$.time.ZoneId) this.e;
                return j$.desugar.sun.nio.fs.h.a(strValueOf, strConcat, zoneId != null ? " with zone ".concat(java.lang.String.valueOf(zoneId)) : "");
            default:
                return super.toString();
        }
    }
}
