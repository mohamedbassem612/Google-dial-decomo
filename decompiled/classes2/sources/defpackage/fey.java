package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fey {
    public final java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;

    public fey() {
        this.a = new java.lang.Object();
    }

    public final long a() {
        java.lang.Object obj = this.c;
        if (obj != null) {
            return ((defpackage.flc) obj).b;
        }
        return -1L;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0071  */
    /* JADX WARN: Type inference failed for: r7v4, types: [flj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v2, types: [flm, java.lang.Object] */
    public final void b(defpackage.epz epzVar, android.net.Uri uri, java.util.Map map, long j, long j2, defpackage.fll fllVar) throws defpackage.fhh {
        defpackage.flc flcVar = new defpackage.flc(epzVar, j, j2);
        this.c = flcVar;
        if (this.b == null) {
            defpackage.flj[] fljVarArrA = this.a.a(uri, map);
            int length = fljVarArrA.length;
            aift aiftVarD = aify.d(length);
            if (length == 1) {
                this.b = fljVarArrA[0];
            } else {
                for (int i = 0; i < length; i++) {
                    defpackage.flj fljVar = fljVarArrA[i];
                    try {
                        if (fljVar.e(flcVar)) {
                            this.b = fljVar;
                            ahvr.bY(fljVar != null || flcVar.b == j);
                            flcVar.k();
                            break;
                        } else {
                            aiftVarD.k(fljVar.a());
                            boolean z = this.b != null || flcVar.b == j;
                            ahvr.bY(z);
                            flcVar.k();
                        }
                    } catch (java.io.EOFException unused) {
                        if (this.b != null || flcVar.b == j) {
                        }
                    } catch (java.lang.Throwable th) {
                        ahvr.bY(this.b != null || flcVar.b == j);
                        flcVar.k();
                        throw th;
                    }
                    ahvr.bY(z);
                    flcVar.k();
                }
                if (this.b == null) {
                    throw new defpackage.fhh("None of the available extractors (" + new ahyj(", ").b(ahvr.aO(aify.o(fljVarArrA), new defpackage.exn(2))) + ") could read the stream.", aiftVarD.h());
                }
            }
            this.b.b(fllVar);
        }
    }

    public fey(defpackage.flm flmVar) {
        this.a = flmVar;
    }
}
