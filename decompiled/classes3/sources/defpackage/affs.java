package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class affs implements afef {
    public boolean a;

    /* JADX WARN: Code duplicated, block: B:14:0x002f A[Catch: IOException -> 0x004f, TRY_ENTER, TryCatch #1 {IOException -> 0x004f, blocks: (B:3:0x0008, B:5:0x000e, B:18:0x0047, B:14:0x002f, B:15:0x0037, B:17:0x003d, B:19:0x004b), top: B:27:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x003d A[Catch: IOException -> 0x004f, LOOP:0: B:15:0x0037->B:17:0x003d, LOOP_END, TryCatch #1 {IOException -> 0x004f, blocks: (B:3:0x0008, B:5:0x000e, B:18:0x0047, B:14:0x002f, B:15:0x0037, B:17:0x003d, B:19:0x004b), top: B:27:0x0008 }] */
    private final void b(aogc aogcVar, android.net.Uri uri, java.util.List list) {
        java.util.Iterator it;
        defpackage.affp affpVar = new defpackage.affp();
        affpVar.b();
        try {
            if (!aogcVar.S(uri)) {
                aogcVar.P(uri);
                return;
            }
            if (this.a) {
                try {
                    java.io.File file = (java.io.File) aogcVar.M(uri, affpVar);
                    if (file == null || !file.exists() || (android.system.Os.lstat(file.getAbsolutePath()).st_mode & android.system.OsConstants.S_IFLNK) == 0) {
                        it = aogcVar.L(uri).iterator();
                        while (it.hasNext()) {
                            b(aogcVar, (android.net.Uri) it.next(), list);
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
            } else {
                it = aogcVar.L(uri).iterator();
                while (it.hasNext()) {
                    b(aogcVar, (android.net.Uri) it.next(), list);
                }
            }
            aogcVar.O(uri);
        } catch (java.io.IOException e) {
            list.add(e);
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(ahbz ahbzVar) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        b((aogc) ahbzVar.a, (android.net.Uri) ahbzVar.c, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        java.io.IOException iOException = new java.io.IOException("Failed to delete one or more files");
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iOException.addSuppressed((java.io.IOException) it.next());
        }
        throw iOException;
    }
}
