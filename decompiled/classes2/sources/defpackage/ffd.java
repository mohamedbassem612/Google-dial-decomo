package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ffd implements defpackage.fgx {
    private final aify a;
    private long b;

    public ffd(java.util.List list, java.util.List list2) {
        aift aiftVar = new aift(4);
        ahvr.bM(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            aiftVar.i(new defpackage.ffc((defpackage.fgx) list.get(i), (java.util.List) list2.get(i)));
        }
        this.a = aiftVar.h();
        this.b = -9223372036854775807L;
    }

    @Override // defpackage.fgx
    public final long a() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        long jMin2 = Long.MAX_VALUE;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                break;
            }
            defpackage.ffc ffcVar = (defpackage.ffc) aikeVar.get(i);
            long jA = ffcVar.a();
            aify aifyVar = ffcVar.a;
            if ((aifyVar.contains(1) || aifyVar.contains(2) || aifyVar.contains(4)) && jA != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, jA);
            }
            if (jA != Long.MIN_VALUE) {
                jMin2 = java.lang.Math.min(jMin2, jA);
            }
            i++;
        }
        if (jMin != Long.MAX_VALUE) {
            this.b = jMin;
            return jMin;
        }
        if (jMin2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j = this.b;
        return j == -9223372036854775807L ? jMin2 : j;
    }

    @Override // defpackage.fgx
    public final long b() {
        int i = 0;
        long jMin = Long.MAX_VALUE;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                break;
            }
            long jB = ((defpackage.ffc) aikeVar.get(i)).b();
            if (jB != Long.MIN_VALUE) {
                jMin = java.lang.Math.min(jMin, jB);
            }
            i++;
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // defpackage.fgx
    public final void dH(long j) {
        int i = 0;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                return;
            }
            ((defpackage.ffc) aikeVar.get(i)).dH(j);
            i++;
        }
    }

    @Override // defpackage.fgx
    public final boolean dI(defpackage.eyo eyoVar) {
        boolean zDI;
        boolean z = false;
        do {
            long jB = b();
            if (jB == Long.MIN_VALUE) {
                break;
            }
            int i = 0;
            zDI = false;
            while (true) {
                aike aikeVar = this.a;
                if (i >= aikeVar.d) {
                    break;
                }
                long jB2 = ((defpackage.ffc) aikeVar.get(i)).b();
                boolean z2 = jB2 != Long.MIN_VALUE && jB2 <= eyoVar.a;
                if (jB2 == jB || z2) {
                    zDI |= ((defpackage.ffc) aikeVar.get(i)).dI(eyoVar);
                }
                i++;
            }
            z |= zDI;
        } while (zDI);
        return z;
    }

    @Override // defpackage.fgx
    public final boolean e() {
        int i = 0;
        while (true) {
            aike aikeVar = this.a;
            if (i >= aikeVar.d) {
                return false;
            }
            if (((defpackage.ffc) aikeVar.get(i)).e()) {
                return true;
            }
            i++;
        }
    }
}
