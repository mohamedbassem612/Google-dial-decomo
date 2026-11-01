package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affm implements afef {
    private final /* synthetic */ int $cid;

    public affm(int i) {
        this.$cid = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: affa */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v2, types: [affu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.Object, java.util.List] */
    public final /* synthetic */ java.lang.Object a(ahbz ahbzVar) throws java.io.IOException, affa {
        int i = this.$cid;
        if (i == 0) {
            java.io.OutputStream outputStreamE = ahbzVar.b.e((android.net.Uri) ahbzVar.c);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(outputStreamE);
            ?? r3 = ahbzVar.f;
            if (!r3.isEmpty()) {
                java.lang.Object obj = ahbzVar.e;
                int i2 = defpackage.afee.a;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.Iterator it = r3.iterator();
                while (it.hasNext()) {
                    defpackage.affx affxVarA = ((affy) it.next()).a((android.net.Uri) obj);
                    if (affxVarA != null) {
                        arrayList2.add(affxVarA);
                    }
                }
                defpackage.afee afeeVar = arrayList2.isEmpty() ? null : new defpackage.afee(outputStreamE, arrayList2);
                if (afeeVar != null) {
                    arrayList.add(afeeVar);
                }
            }
            java.util.Iterator it2 = ahbzVar.d.iterator();
            while (it2.hasNext()) {
                arrayList.add(((affz) it2.next()).d((java.io.OutputStream) ahvr.bk(arrayList)));
            }
            java.util.Collections.reverse(arrayList);
            return (java.io.OutputStream) arrayList.get(0);
        }
        if (i == 1) {
            if (ahbzVar.l()) {
                throw new affa("Transforms are not supported by this Opener: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(ahbzVar.e))));
            }
            return new defpackage.affi((aogc) ahbzVar.a, (android.net.Uri) ahbzVar.e);
        }
        if (i == 2) {
            defpackage.affp affpVar = new defpackage.affp();
            affpVar.b();
            android.os.ParcelFileDescriptor parcelFileDescriptorOpen = android.os.ParcelFileDescriptor.open((java.io.File) ((aogc) ahbzVar.a).M((android.net.Uri) ahbzVar.c, affpVar), 805306368);
            try {
                parcelFileDescriptorOpen.getFd();
                if (parcelFileDescriptorOpen == null) {
                    return null;
                }
                parcelFileDescriptorOpen.close();
                return null;
            } catch (java.lang.Throwable th) {
                if (parcelFileDescriptorOpen != null) {
                    try {
                        parcelFileDescriptorOpen.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (i == 3) {
            defpackage.affp affpVar2 = new defpackage.affp();
            affpVar2.b();
            java.io.File fileA = affpVar2.a(ahbzVar);
            aisq.b(fileA);
            return new java.io.RandomAccessFile(fileA, "rw");
        }
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        android.net.Uri uriBuild = ((android.net.Uri) ahbzVar.e).buildUpon().fragment(null).build();
        aogc aogcVar = (aogc) ahbzVar.a;
        ahvr.bp(arrayDeque, aogcVar.L(uriBuild));
        long jK = 0;
        while (!arrayDeque.isEmpty()) {
            android.net.Uri uri = (android.net.Uri) arrayDeque.remove();
            if (aogcVar.S(uri)) {
                ahvr.bp(arrayDeque, aogcVar.L(uri));
            } else {
                if (!aogcVar.R(uri)) {
                    throw new java.io.FileNotFoundException(java.lang.String.format("Child %s could not be opened", uri));
                }
                jK += aogcVar.K(uri);
            }
        }
        return java.lang.Long.valueOf(jK);
    }
}
