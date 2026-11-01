package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vhs {
    private static final java.lang.String[] b = {"X-Android-Attachment-StoreData"};
    protected final java.util.ArrayList a = new java.util.ArrayList();

    public final java.lang.String a(java.lang.String str) {
        java.lang.String[] strArrE = e(str);
        if (strArrE == null) {
            return null;
        }
        return strArrE[0];
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        this.a.add(new defpackage.vhr(str, str2));
    }

    public final void c(java.lang.String str, java.lang.String str2) {
        if (str2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = this.a;
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                defpackage.vhr vhrVar = (defpackage.vhr) arrayList2.get(i);
                if (vhrVar.a.equalsIgnoreCase(str)) {
                    arrayList.add(vhrVar);
                }
            }
            arrayList2.removeAll(arrayList);
            b(str, str2);
        }
    }

    public final void d(java.io.OutputStream outputStream) throws java.io.IOException {
        java.io.BufferedWriter bufferedWriter = new java.io.BufferedWriter(new java.io.OutputStreamWriter(outputStream), 1024);
        java.util.ArrayList arrayList = this.a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.vhr vhrVar = (defpackage.vhr) arrayList.get(i);
            java.lang.Object[] objArr = b;
            java.lang.String str = vhrVar.a;
            if (!objArr[0].equals(str)) {
                bufferedWriter.write(str + ": " + vhrVar.b + "\r\n");
            }
        }
        bufferedWriter.flush();
    }

    public final java.lang.String[] e(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.a;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            defpackage.vhr vhrVar = (defpackage.vhr) arrayList2.get(i);
            if (vhrVar.a.equalsIgnoreCase(str)) {
                arrayList.add(vhrVar.b);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }
}
