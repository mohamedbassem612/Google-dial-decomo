package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ybu implements defpackage.xuu {
    private final defpackage.yao a;
    private final java.util.List b;
    private final boolean c;
    private final boolean d;
    private final defpackage.xxt e;
    private final defpackage.uyg f;

    public ybu(java.util.List list, boolean z, defpackage.xxt xxtVar, boolean z2, boolean z3) {
        this.b = list;
        this.c = z;
        this.e = xxtVar;
        this.d = z2;
        this.f = z3 ? new defpackage.uyg(list, xxtVar) : null;
        this.a = new defpackage.yao(z3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0074 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f A[LOOP:3: B:40:0x007d->B:41:0x007f, LOOP_END] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ defpackage.xxe a(java.lang.Object obj, int i, int i2, defpackage.xus xusVar) throws java.lang.Throwable {
        java.nio.ByteBuffer byteBufferA;
        defpackage.xxt xxtVar;
        byte[] bArr;
        boolean z;
        int size;
        int i3;
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        if (!this.d || (xxtVar = this.e) == null) {
            byteBufferA = defpackage.yfp.a(inputStream, this.c);
        } else {
            boolean z2 = this.c;
            int i4 = defpackage.yfp.a;
            java.util.ArrayList<byte[]> arrayList = new java.util.ArrayList();
            int i5 = 0;
            do {
                bArr = null;
                try {
                    byte[] bArr2 = (byte[]) xxtVar.a(16384, byte[].class);
                    i3 = 0;
                    while (i3 < 16384) {
                        try {
                            int i6 = inputStream.read(bArr2, i3, 16384 - i3);
                            if (i6 == -1) {
                                break;
                            }
                            i3 += i6;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            z = false;
                            bArr = bArr2;
                            if (!z) {
                                if (bArr != null) {
                                    xxtVar.c(bArr);
                                }
                                size = arrayList.size();
                                for (int i7 = 0; i7 < size; i7++) {
                                    xxtVar.c((byte[]) arrayList.get(i7));
                                }
                            }
                            throw th;
                        }
                    }
                    if (i3 == 0) {
                        xxtVar.c(bArr2);
                        break;
                    }
                    arrayList.add(bArr2);
                    i5 += i3;
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    z = false;
                }
            } while (i3 >= 16384);
            java.nio.ByteBuffer byteBufferAllocate = z2 ? java.nio.ByteBuffer.allocate(i5) : java.nio.ByteBuffer.allocateDirect(i5);
            for (byte[] bArr3 : arrayList) {
                int iMin = java.lang.Math.min(i5, 16384);
                byteBufferAllocate.put(bArr3, 0, iMin);
                i5 -= iMin;
                xxtVar.c(bArr3);
            }
            arrayList.clear();
            try {
                byteBufferA = defpackage.yfp.b(byteBufferAllocate);
            } catch (java.lang.Throwable th3) {
                th = th3;
                z = true;
                if (!z) {
                    if (bArr != null) {
                        xxtVar.c(bArr);
                    }
                    size = arrayList.size();
                    while (i7 < size) {
                        xxtVar.c((byte[]) arrayList.get(i7));
                    }
                }
                throw th;
            }
        }
        defpackage.uyg uygVar = this.f;
        if (uygVar != null) {
            xusVar = uygVar.m(byteBufferA, xusVar);
        }
        return this.a.c(android.graphics.ImageDecoder.createSource(byteBufferA), i, i2, xusVar);
    }

    @Override // defpackage.xuu
    public final /* bridge */ /* synthetic */ boolean b(java.lang.Object obj, defpackage.xus xusVar) {
        java.io.InputStream inputStream = (java.io.InputStream) obj;
        if (!this.d) {
            return true;
        }
        defpackage.xxt xxtVar = this.e;
        return (xxtVar == null || defpackage.xff.G(this.b, inputStream, xxtVar) == com.bumptech.glide.load.ImageHeaderParser$ImageType.UNKNOWN) ? false : true;
    }
}
