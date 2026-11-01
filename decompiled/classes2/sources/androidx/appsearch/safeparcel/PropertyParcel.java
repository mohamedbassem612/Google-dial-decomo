package androidx.appsearch.safeparcel;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class PropertyParcel extends defpackage.rm implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(15);
    public final java.lang.String a;
    public final java.lang.String[] b;
    public final long[] c;
    public final double[] d;
    public final boolean[] e;
    public final byte[][] f;
    public final androidx.appsearch.safeparcel.GenericDocumentParcel[] g;
    public final defpackage.pu[] h;
    public final defpackage.pe[] i;
    private java.lang.Integer j;

    public PropertyParcel(java.lang.String str, java.lang.String[] strArr, long[] jArr, double[] dArr, boolean[] zArr, byte[][] bArr, androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr, defpackage.pu[] puVarArr, defpackage.pe[] peVarArr) {
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.b = strArr;
        this.c = jArr;
        this.d = dArr;
        this.e = zArr;
        this.f = bArr;
        this.g = genericDocumentParcelArr;
        this.h = puVarArr;
        this.i = peVarArr;
        int i = strArr != null ? 1 : 0;
        i = jArr != null ? i + 1 : i;
        i = dArr != null ? i + 1 : i;
        i = zArr != null ? i + 1 : i;
        i = bArr != null ? i + 1 : i;
        i = genericDocumentParcelArr != null ? i + 1 : i;
        i = puVarArr != null ? i + 1 : i;
        i = peVarArr != null ? i + 1 : i;
        if (i == 0 || i > 1) {
            throw new java.lang.IllegalArgumentException("One and only one type array can be set in PropertyParcel");
        }
    }

    public final java.lang.Object a() {
        java.lang.String[] strArr = this.b;
        if (strArr != null) {
            return strArr;
        }
        long[] jArr = this.c;
        if (jArr != null) {
            return jArr;
        }
        double[] dArr = this.d;
        if (dArr != null) {
            return dArr;
        }
        boolean[] zArr = this.e;
        if (zArr != null) {
            return zArr;
        }
        byte[][] bArr = this.f;
        if (bArr != null) {
            return bArr;
        }
        androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr = this.g;
        if (genericDocumentParcelArr != null) {
            return genericDocumentParcelArr;
        }
        defpackage.pu[] puVarArr = this.h;
        if (puVarArr != null) {
            return puVarArr;
        }
        defpackage.pe[] peVarArr = this.i;
        if (peVarArr == null) {
            return null;
        }
        return peVarArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.appsearch.safeparcel.PropertyParcel) {
            androidx.appsearch.safeparcel.PropertyParcel propertyParcel = (androidx.appsearch.safeparcel.PropertyParcel) obj;
            if (this.a.equals(propertyParcel.a) && java.util.Arrays.equals(this.b, propertyParcel.b) && java.util.Arrays.equals(this.c, propertyParcel.c) && java.util.Arrays.equals(this.d, propertyParcel.d) && java.util.Arrays.equals(this.e, propertyParcel.e) && java.util.Arrays.deepEquals(this.f, propertyParcel.f) && java.util.Arrays.equals(this.g, propertyParcel.g) && java.util.Arrays.deepEquals(this.h, propertyParcel.h) && java.util.Arrays.deepEquals(this.i, propertyParcel.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iDeepHashCode;
        java.lang.Integer numValueOf = this.j;
        if (numValueOf == null) {
            java.lang.String[] strArr = this.b;
            if (strArr != null) {
                iDeepHashCode = java.util.Arrays.hashCode(strArr);
            } else {
                long[] jArr = this.c;
                if (jArr != null) {
                    iDeepHashCode = java.util.Arrays.hashCode(jArr);
                } else {
                    double[] dArr = this.d;
                    if (dArr != null) {
                        iDeepHashCode = java.util.Arrays.hashCode(dArr);
                    } else {
                        boolean[] zArr = this.e;
                        if (zArr != null) {
                            iDeepHashCode = java.util.Arrays.hashCode(zArr);
                        } else {
                            byte[][] bArr = this.f;
                            if (bArr != null) {
                                iDeepHashCode = java.util.Arrays.deepHashCode(bArr);
                            } else {
                                androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr = this.g;
                                if (genericDocumentParcelArr != null) {
                                    iDeepHashCode = java.util.Arrays.hashCode(genericDocumentParcelArr);
                                } else {
                                    defpackage.pu[] puVarArr = this.h;
                                    if (puVarArr != null) {
                                        iDeepHashCode = java.util.Arrays.deepHashCode(puVarArr);
                                    } else {
                                        defpackage.pe[] peVarArr = this.i;
                                        iDeepHashCode = peVarArr != null ? java.util.Arrays.deepHashCode(peVarArr) : 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            numValueOf = java.lang.Integer.valueOf(j$.util.Objects.hash(new java.lang.Object[]{this.a, java.lang.Integer.valueOf(iDeepHashCode)}));
            this.j = numValueOf;
        }
        return numValueOf.intValue();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        j$.util.Objects.requireNonNull(this);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("propertyName", this.a);
        java.lang.String[] strArr = this.b;
        if (strArr != null) {
            bundle.putStringArray("stringArray", strArr);
        } else {
            long[] jArr = this.c;
            if (jArr != null) {
                bundle.putLongArray("longArray", jArr);
            } else {
                double[] dArr = this.d;
                if (dArr != null) {
                    bundle.putDoubleArray("doubleArray", dArr);
                } else {
                    boolean[] zArr = this.e;
                    if (zArr != null) {
                        bundle.putBooleanArray("booleanArray", zArr);
                    } else {
                        byte[][] bArr = this.f;
                        int i2 = 0;
                        if (bArr != null) {
                            java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(bArr.length);
                            while (i2 < bArr.length) {
                                android.os.Bundle bundle2 = new android.os.Bundle();
                                bundle2.putByteArray("byteArray", bArr[i2]);
                                arrayList.add(bundle2);
                                i2++;
                            }
                            bundle.putParcelableArrayList("bytesArray", arrayList);
                        } else {
                            androidx.appsearch.safeparcel.GenericDocumentParcel[] genericDocumentParcelArr = this.g;
                            if (genericDocumentParcelArr != null) {
                                bundle.putParcelableArray("docArray", genericDocumentParcelArr);
                            } else {
                                defpackage.pu[] puVarArr = this.h;
                                if (puVarArr != null) {
                                    java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>(puVarArr.length);
                                    while (i2 < puVarArr.length) {
                                        android.os.Bundle bundle3 = new android.os.Bundle();
                                        bundle3.putFloatArray("embeddingValue", puVarArr[i2].a);
                                        bundle3.putString("embeddingModelSignature", puVarArr[i2].b);
                                        arrayList2.add(bundle3);
                                        i2++;
                                    }
                                    bundle.putParcelableArrayList("embeddingArray", arrayList2);
                                }
                            }
                        }
                    }
                }
            }
        }
        parcel.writeBundle(bundle);
    }
}
