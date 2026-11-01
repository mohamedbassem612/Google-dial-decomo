package com.google.android.gms.feedback;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class FileTeleporter extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.xkl(17);
    android.os.ParcelFileDescriptor a;
    final java.lang.String b;
    final java.lang.String c;
    byte[] d;
    public java.io.File e;

    public FileTeleporter(android.os.ParcelFileDescriptor parcelFileDescriptor, java.lang.String str, java.lang.String str2) {
        this.a = parcelFileDescriptor;
        this.b = str;
        this.c = str2;
    }

    static final void a(java.io.Closeable closeable) {
        try {
            closeable.close();
        } catch (java.io.IOException e) {
            android.util.Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public final void writeToParcel(android.os.Parcel parcel, int i) {
        if (this.a == null) {
            java.io.File file = this.e;
            if (file == null) {
                throw new java.lang.IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
            }
            try {
                java.io.File fileCreateTempFile = java.io.File.createTempFile("teleporter", ".tmp", file);
                try {
                    java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(fileCreateTempFile);
                    this.a = android.os.ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(fileOutputStream);
                    try {
                        try {
                            dataOutputStream.writeInt(this.d.length);
                            dataOutputStream.writeUTF(this.b);
                            dataOutputStream.writeUTF(this.c);
                            dataOutputStream.write(this.d);
                            a(dataOutputStream);
                        } catch (java.lang.Throwable th) {
                            a(dataOutputStream);
                            throw th;
                        }
                    } catch (java.io.IOException e) {
                        throw new java.lang.IllegalStateException("Could not write into unlinked file", e);
                    }
                } catch (java.io.FileNotFoundException unused) {
                    throw new java.lang.IllegalStateException("Temporary file is somehow already deleted.");
                }
            } catch (java.io.IOException e2) {
                throw new java.lang.IllegalStateException("Could not create temporary file:", e2);
            }
        }
        int iF = aais.f(parcel, 20293);
        aais.z(parcel, 2, this.a, i);
        aais.A(parcel, 3, this.b);
        aais.A(parcel, 4, this.c);
        aais.g(parcel, iF);
    }

    public FileTeleporter(byte[] bArr, java.lang.String str) {
        this(null, "text/plain", str);
        this.d = bArr;
    }
}
