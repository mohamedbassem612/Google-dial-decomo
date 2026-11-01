package com.google.apps.tiktok.cache;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ParcelableKeyValueStore implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(4);
    public final java.lang.Object a;
    public final java.util.Map b;
    public albh c;
    private boolean d;
    private com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[] e;

    /* JADX INFO: compiled from: PG */
    public final class ParcelableEntry implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator CREATOR = new defpackage.agmr(5);
        public final com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto a;
        public final com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto b;
        public final j$.time.Instant c;

        public ParcelableEntry(com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto, com.google.protobuf.contrib.android.ProtoParsers.ParcelableProto parcelableProto2, j$.time.Instant instant) {
            this.a = parcelableProto;
            this.b = parcelableProto2;
            this.c = instant;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i) {
            parcel.writeParcelable(this.a, 0);
            parcel.writeParcelable(this.b, 0);
            parcel.writeLong(this.c.toEpochMilli());
        }
    }

    public ParcelableKeyValueStore(com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[] parcelableEntryArr) {
        this.a = new java.lang.Object();
        this.d = true;
        this.e = parcelableEntryArr;
        this.b = new java.util.HashMap();
    }

    public final void a(albh albhVar) {
        ahvr.ci(this.c);
        if (this.d) {
            for (com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry parcelableEntry : this.e) {
                this.b.put(parcelableEntry.a.a(((alad) albhVar).r(), akzq.a()), new apjb(parcelableEntry.b.a(this.c, akzq.a()), parcelableEntry.c));
            }
            this.e = null;
            this.d = false;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [albh, java.lang.Object] */
    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        synchronized (this.a) {
            if (this.d) {
                parcel.writeInt(this.e.length);
                for (com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry parcelableEntry : this.e) {
                    parcel.writeParcelable(parcelableEntry, 0);
                }
            } else {
                java.util.Map map = this.b;
                parcel.writeInt(map.size());
                for (java.util.Map.Entry entry : map.entrySet()) {
                    apjb apjbVar = (apjb) entry.getValue();
                    parcel.writeParcelable(new com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry(new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, (albh) entry.getKey()), new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, (albh) apjbVar.a), (j$.time.Instant) apjbVar.b), 0);
                }
            }
        }
    }

    ParcelableKeyValueStore() {
        this(new com.google.apps.tiktok.cache.ParcelableKeyValueStore.ParcelableEntry[0]);
    }
}
