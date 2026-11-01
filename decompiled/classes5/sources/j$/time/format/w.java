package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class w {
    public final j$.time.temporal.TemporalAccessor a;
    public final j$.time.format.DateTimeFormatter b;
    public int c;

    /* JADX WARN: Code duplicated, block: B:36:0x0099  */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x009e  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x00b2, please report this as an issue */
    public w(j$.time.temporal.TemporalAccessor temporalAccessor, j$.time.format.DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.a aVar;
        j$.time.ZoneId zoneId;
        int i;
        j$.time.ZoneId zoneIdD;
        java.lang.Object objRequireNonNull;
        j$.time.chrono.q qVar = dateTimeFormatter.e;
        j$.time.ZoneId zoneId2 = dateTimeFormatter.f;
        if (qVar != null || zoneId2 != null) {
            j$.time.chrono.a aVar2 = (j$.time.chrono.a) temporalAccessor.G(j$.time.temporal.m.b);
            j$.time.ZoneId zoneId3 = (j$.time.ZoneId) temporalAccessor.G(j$.time.temporal.m.a);
            j$.time.chrono.ChronoLocalDate chronoLocalDateL = null;
            qVar = j$.util.Objects.equals(qVar, aVar2) ? null : qVar;
            zoneId2 = j$.util.Objects.equals(zoneId2, zoneId3) ? null : zoneId2;
            if (qVar == null) {
                aVar = zoneId2 != null ? aVar2 : aVar;
            } else {
                aVar = qVar;
            }
            if (zoneId2 == null) {
                if (zoneId2 != null) {
                    zoneId = zoneId2;
                } else {
                    zoneId = zoneId3;
                }
                if (qVar != null) {
                    if (temporalAccessor.c(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDateL = aVar.l(temporalAccessor);
                    } else if (qVar == j$.time.chrono.q.c || aVar2 != null) {
                        for (j$.time.temporal.a aVar3 : j$.time.temporal.a.values()) {
                            if (!aVar3.isDateBased() && temporalAccessor.c(aVar3)) {
                                j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Unable to apply override chronology '", java.lang.String.valueOf(qVar), "' because the temporal object being formatted contains date fields but does not represent a whole date: ", java.lang.String.valueOf(temporalAccessor)));
                                throw null;
                            }
                        }
                    }
                }
                temporalAccessor = new j$.nio.file.n(chronoLocalDateL, temporalAccessor, aVar, zoneId, (byte) 1);
            } else if (temporalAccessor.c(j$.time.temporal.a.INSTANT_SECONDS)) {
                j$.time.chrono.q qVar2 = j$.time.chrono.q.c;
                if (aVar == null) {
                    objRequireNonNull = aVar;
                    objRequireNonNull = j$.util.Objects.requireNonNull(qVar2, "defaultObj");
                }
                objRequireNonNull = aVar;
                temporalAccessor = ((j$.time.chrono.a) objRequireNonNull).V(j$.time.Instant.from(temporalAccessor), zoneId2);
            } else {
                try {
                    j$.time.zone.ZoneRules rules = zoneId2.getRules();
                    zoneIdD = rules.h() ? rules.d(j$.time.Instant.EPOCH) : zoneId2;
                } catch (j$.time.zone.e unused) {
                }
                if (zoneIdD instanceof j$.time.ZoneOffset) {
                    j$.time.temporal.a aVar4 = j$.time.temporal.a.OFFSET_SECONDS;
                    if (temporalAccessor.c(aVar4) && temporalAccessor.h(aVar4) != zoneId2.getRules().d(j$.time.Instant.EPOCH).getTotalSeconds()) {
                        j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Unable to apply override zone '", java.lang.String.valueOf(zoneId2), "' because the temporal object being formatted has a different offset but does not represent an instant: ", java.lang.String.valueOf(temporalAccessor)));
                        throw null;
                    }
                }
                if (zoneId2 != null) {
                    zoneId = zoneId2;
                } else {
                    zoneId = zoneId3;
                }
                if (qVar != null) {
                    if (temporalAccessor.c(j$.time.temporal.a.EPOCH_DAY)) {
                        chronoLocalDateL = aVar.l(temporalAccessor);
                    } else if (qVar == j$.time.chrono.q.c) {
                        while (i < r2) {
                            if (!aVar3.isDateBased()) {
                            }
                        }
                    } else {
                        while (i < r2) {
                            if (!aVar3.isDateBased()) {
                            }
                        }
                    }
                }
                temporalAccessor = new j$.nio.file.n(chronoLocalDateL, temporalAccessor, aVar, zoneId, (byte) 1);
            }
        }
        this.a = temporalAccessor;
        this.b = dateTimeFormatter;
    }

    public final java.lang.Long a(j$.time.temporal.l lVar) {
        int i = this.c;
        j$.time.temporal.TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.c(lVar)) {
            return java.lang.Long.valueOf(temporalAccessor.D(lVar));
        }
        return null;
    }

    public final java.lang.Object b(j$.time.temporal.TemporalQuery temporalQuery) {
        j$.time.temporal.TemporalAccessor temporalAccessor = this.a;
        java.lang.Object objG = temporalAccessor.G(temporalQuery);
        if (objG != null || this.c != 0) {
            return objG;
        }
        j$.time.g.h(j$.desugar.sun.nio.fs.h.b("Unable to extract ", java.lang.String.valueOf(temporalQuery), " from temporal ", java.lang.String.valueOf(temporalAccessor)));
        return null;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
