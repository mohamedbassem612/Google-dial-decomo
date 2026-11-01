package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class nrl extends aomh implements aonn {
    final /* synthetic */ long a;
    final /* synthetic */ defpackage.nst b;
    final /* synthetic */ defpackage.nmz c;
    final /* synthetic */ pgi d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrl(pgi pgiVar, long j, defpackage.nst nstVar, defpackage.nmz nmzVar, aoln aolnVar) {
        super(2, aolnVar);
        this.d = pgiVar;
        this.a = j;
        this.b = nstVar;
        this.c = nmzVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
    public final java.lang.Object b(java.lang.Object obj) throws aois {
        aooc.af(obj);
        java.io.File filesDir = ((android.content.Context) this.d.a).getFilesDir();
        java.lang.String str = java.lang.String.format(java.util.Locale.US, "dobby_transcripts_%d.data", java.util.Arrays.copyOf(new java.lang.Object[]{new java.lang.Long(this.a)}, 1));
        aooh.e(str, "format(...)");
        java.io.File file = new java.io.File(filesDir, str);
        defpackage.nwj nwjVarAo = mni.ao(defpackage.nst.a.m());
        for (defpackage.nsj nsjVar : this.b.b) {
            int i = nsjVar.c;
            int iAr = mni.ar(i);
            if (iAr == 0) {
                throw null;
            }
            if (iAr - 1 != 1) {
                nwjVarAo.k();
                aooh.c(nsjVar);
                nwjVarAo.l(nsjVar);
            } else {
                java.lang.String str2 = (i == 4 ? (defpackage.nsh) nsjVar.d : defpackage.nsh.a).c;
                aooh.e(str2, "getText(...)");
                if (str2.length() > 0) {
                    nwjVarAo.k();
                    aooh.c(nsjVar);
                    nwjVarAo.l(nsjVar);
                }
            }
        }
        defpackage.nst nstVarJ = nwjVarAo.j();
        java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file);
        try {
            nstVarJ.h(fileOutputStream);
            ajsz.ak(fileOutputStream, (java.lang.Throwable) null);
            defpackage.nmz nmzVar = this.c;
            defpackage.npw npwVarAm = mni.am(defpackage.nss.a.m());
            java.lang.String absolutePath = file.getAbsolutePath();
            aooh.e(absolutePath, "getAbsolutePath(...)");
            npwVarAm.j(absolutePath);
            if (nmzVar instanceof defpackage.nmy) {
                defpackage.nmy nmyVar = (defpackage.nmy) nmzVar;
                java.lang.String str3 = nmyVar.a;
                aooh.f(str3, "value");
                akzx akzxVar = (akzx) npwVarAm.a;
                akzxVar.u();
                defpackage.nss nssVar = (defpackage.nss) akzxVar.b;
                j$.util.Objects.requireNonNull(str3);
                nssVar.b |= 1;
                nssVar.d = str3;
                boolean z = nmyVar.b;
                akzxVar.u();
                defpackage.nss nssVar2 = (defpackage.nss) akzxVar.b;
                nssVar2.b |= 4;
                nssVar2.f = z;
            } else if (nmzVar instanceof defpackage.nmx) {
                java.lang.String str4 = ((defpackage.nmx) nmzVar).a;
                aooh.f(str4, "value");
                akzx akzxVar2 = (akzx) npwVarAm.a;
                akzxVar2.u();
                defpackage.nss nssVar3 = (defpackage.nss) akzxVar2.b;
                j$.util.Objects.requireNonNull(str4);
                nssVar3.b |= 2;
                nssVar3.e = str4;
            } else if (!aooh.n(nmzVar, defpackage.nmw.a)) {
                throw new aois();
            }
            return npwVarAm.i();
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                ajsz.ak(fileOutputStream, th);
                throw th2;
            }
        }
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.nrl(this.d, this.a, this.b, this.c, aolnVar);
    }
}
