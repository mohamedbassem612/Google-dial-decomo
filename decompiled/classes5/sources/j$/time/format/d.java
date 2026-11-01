package j$.time.format;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class d implements j$.time.format.e {
    public final j$.time.format.e[] a;
    public final boolean b;

    public d(java.util.ArrayList arrayList, boolean z) {
        this((j$.time.format.e[]) arrayList.toArray(new j$.time.format.e[arrayList.size()]), z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0027 A[DONT_GENERATE] */
    @Override // j$.time.format.e
    public final boolean h(j$.time.format.w wVar, java.lang.StringBuilder sb) {
        int length = sb.length();
        boolean z = this.b;
        if (z) {
            wVar.c++;
        }
        try {
            for (j$.time.format.e eVar : this.a) {
                if (!eVar.h(wVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            return true;
        } finally {
            if (z) {
                wVar.c--;
            }
        }
    }

    @Override // j$.time.format.e
    public final int k(j$.time.format.v vVar, java.lang.CharSequence charSequence, int i) {
        java.util.ArrayList arrayList = vVar.d;
        boolean z = this.b;
        j$.time.format.e[] eVarArr = this.a;
        int i2 = 0;
        if (!z) {
            int length = eVarArr.length;
            while (i2 < length) {
                i = eVarArr[i2].k(vVar, charSequence, i);
                if (i < 0) {
                    return i;
                }
                i2++;
            }
            return i;
        }
        j$.time.format.b0 b0VarC = vVar.c();
        b0VarC.getClass();
        j$.time.format.b0 b0Var = new j$.time.format.b0();
        b0Var.a.putAll(b0VarC.a);
        b0Var.b = b0VarC.b;
        b0Var.c = b0VarC.c;
        b0Var.d = b0VarC.d;
        arrayList.add(b0Var);
        int length2 = eVarArr.length;
        int iK = i;
        while (i2 < length2) {
            iK = eVarArr[i2].k(vVar, charSequence, iK);
            if (iK < 0) {
                arrayList.remove(arrayList.size() - 1);
                return i;
            }
            i2++;
        }
        arrayList.remove(arrayList.size() - 2);
        return iK;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        j$.time.format.e[] eVarArr = this.a;
        if (eVarArr != null) {
            boolean z = this.b;
            sb.append(z ? "[" : "(");
            for (j$.time.format.e eVar : eVarArr) {
                sb.append(eVar);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }

    public d(j$.time.format.e[] eVarArr, boolean z) {
        this.a = eVarArr;
        this.b = z;
    }
}
