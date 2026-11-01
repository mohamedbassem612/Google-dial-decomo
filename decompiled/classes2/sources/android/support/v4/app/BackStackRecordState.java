package android.support.v4.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class BackStackRecordState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.v(1);
    public final int[] a;
    public final java.util.ArrayList b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final java.lang.String f;
    public final int g;
    public final int h;
    public final java.lang.CharSequence i;
    public final int j;
    public final java.lang.CharSequence k;
    public final java.util.ArrayList l;
    public final java.util.ArrayList m;
    public final boolean n;

    public BackStackRecordState(u uVar) {
        int size = uVar.d.size();
        this.a = new int[size * 6];
        if (!uVar.j) {
            throw new java.lang.IllegalStateException("Not on back stack");
        }
        this.b = new java.util.ArrayList(size);
        this.c = new int[size];
        this.d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            bv bvVar = (bv) uVar.d.get(i2);
            int i3 = i + 1;
            this.a[i] = bvVar.a;
            java.util.ArrayList arrayList = this.b;
            aw awVar = bvVar.b;
            arrayList.add(awVar != null ? awVar.l : null);
            int[] iArr = this.a;
            iArr[i3] = bvVar.c ? 1 : 0;
            iArr[i + 2] = bvVar.d;
            iArr[i + 3] = bvVar.e;
            int i4 = i + 5;
            iArr[i + 4] = bvVar.f;
            i += 6;
            iArr[i4] = bvVar.g;
            this.c[i2] = bvVar.h.ordinal();
            this.d[i2] = bvVar.i.ordinal();
        }
        this.e = uVar.i;
        this.f = uVar.l;
        this.g = uVar.c;
        this.h = uVar.m;
        this.i = uVar.n;
        this.j = uVar.o;
        this.k = uVar.p;
        this.l = uVar.q;
        this.m = uVar.r;
        this.n = uVar.s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeIntArray(this.a);
        parcel.writeStringList(this.b);
        parcel.writeIntArray(this.c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        android.text.TextUtils.writeToParcel(this.i, parcel, 0);
        parcel.writeInt(this.j);
        android.text.TextUtils.writeToParcel(this.k, parcel, 0);
        parcel.writeStringList(this.l);
        parcel.writeStringList(this.m);
        parcel.writeInt(this.n ? 1 : 0);
    }

    public BackStackRecordState(android.os.Parcel parcel) {
        this.a = parcel.createIntArray();
        this.b = parcel.createStringArrayList();
        this.c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.e = parcel.readInt();
        this.f = parcel.readString();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.readInt();
        this.k = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.l = parcel.createStringArrayList();
        this.m = parcel.createStringArrayList();
        this.n = parcel.readInt() != 0;
    }
}
