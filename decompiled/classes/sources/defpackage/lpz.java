package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lpz {
    private final long a = -4952904746139648L;
    private final long b = -904674731360256L;
    private final long c = -22697257186885632L;
    private final long d = -1530253897891840L;
    private final long e = -46239463289913344L;
    private final long f = -171833051578368L;
    private final long g = -49876158128324608L;
    private final java.util.List h;

    public lpz() {
        java.util.List listAsList = java.util.Arrays.asList(new defpackage.cqg(-4952904746139648L), new defpackage.cqg(-904674731360256L), new defpackage.cqg(-22697257186885632L), new defpackage.cqg(-1530253897891840L), new defpackage.cqg(-46239463289913344L), new defpackage.cqg(-171833051578368L), new defpackage.cqg(-49876158128324608L));
        defpackage.aooh.e(listAsList, "asList(...)");
        this.h = listAsList;
    }

    public final long a(java.lang.String str) {
        defpackage.aooh.f(str, "lookUpKey");
        int iAbs = java.lang.Math.abs(str.hashCode());
        java.util.List list = this.h;
        return ((defpackage.cqg) list.get(iAbs % list.size())).a;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.lpz) {
            defpackage.lpz lpzVar = (defpackage.lpz) obj;
            long j = lpzVar.a;
            if (defpackage.anty.ah(-4952904746139648L, -4952904746139648L)) {
                long j2 = lpzVar.b;
                if (defpackage.anty.ah(-904674731360256L, -904674731360256L)) {
                    long j3 = lpzVar.c;
                    if (defpackage.anty.ah(-22697257186885632L, -22697257186885632L)) {
                        long j4 = lpzVar.d;
                        if (defpackage.anty.ah(-1530253897891840L, -1530253897891840L)) {
                            long j5 = lpzVar.e;
                            if (defpackage.anty.ah(-46239463289913344L, -46239463289913344L)) {
                                long j6 = lpzVar.f;
                                if (defpackage.anty.ah(-171833051578368L, -171833051578368L)) {
                                    long j7 = lpzVar.g;
                                    if (defpackage.anty.ah(-49876158128324608L, -49876158128324608L)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((((defpackage.anty.M(-4952904746139648L) * 31) + defpackage.anty.M(-904674731360256L)) * 31) + defpackage.anty.M(-22697257186885632L)) * 31) + defpackage.anty.M(-1530253897891840L)) * 31) + defpackage.anty.M(-46239463289913344L)) * 31) + defpackage.anty.M(-171833051578368L)) * 31) + defpackage.anty.M(-49876158128324608L);
    }

    public final java.lang.String toString() {
        return "DialerMonogramColors(red=" + defpackage.cqg.g(-4952904746139648L) + ", yellow=" + defpackage.cqg.g(-904674731360256L) + ", purple=" + defpackage.cqg.g(-22697257186885632L) + ", orange=" + defpackage.cqg.g(-1530253897891840L) + ", green=" + defpackage.cqg.g(-46239463289913344L) + ", pink=" + defpackage.cqg.g(-171833051578368L) + ", cyan=" + defpackage.cqg.g(-49876158128324608L) + ')';
    }
}
