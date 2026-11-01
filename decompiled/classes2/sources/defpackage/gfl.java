package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gfl extends android.os.Binder implements android.os.IInterface {
    final /* synthetic */ androidx.room.MultiInstanceInvalidationService a;

    public gfl(androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
        attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
        if (i > 0 && i <= 16777215) {
            parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
        }
        if (i == 1598968902) {
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
            return true;
        }
        int i3 = 0;
        defpackage.gfk gfkVar = null;
        if (i == 1) {
            android.os.IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                android.os.IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                gfkVar = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof defpackage.gfk)) ? new defpackage.gfk(strongBinder) : (defpackage.gfk) iInterfaceQueryLocalInterface;
            }
            java.lang.String string = parcel.readString();
            aooh.f(gfkVar, "callback");
            if (string != null) {
                androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService = this.a;
                android.os.RemoteCallbackList remoteCallbackList = multiInstanceInvalidationService.c;
                synchronized (remoteCallbackList) {
                    int i4 = multiInstanceInvalidationService.a + 1;
                    multiInstanceInvalidationService.a = i4;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(i4);
                    if (remoteCallbackList.register(gfkVar, numValueOf)) {
                        multiInstanceInvalidationService.b.put(numValueOf, string);
                        i3 = i4;
                    } else {
                        multiInstanceInvalidationService.a--;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
        } else {
            if (i != 2) {
                if (i != 3) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                int i5 = parcel.readInt();
                java.lang.String[] strArrCreateStringArray = parcel.createStringArray();
                aooh.f(strArrCreateStringArray, "tables");
                androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.a;
                android.os.RemoteCallbackList remoteCallbackList2 = multiInstanceInvalidationService2.c;
                synchronized (remoteCallbackList2) {
                    try {
                        java.util.Map map = multiInstanceInvalidationService2.b;
                        java.lang.String str = (java.lang.String) map.get(java.lang.Integer.valueOf(i5));
                        if (str == null) {
                            android.util.Log.w("ROOM", "Remote invalidation client ID not registered");
                            return true;
                        }
                        int iBeginBroadcast = remoteCallbackList2.beginBroadcast();
                        while (i3 < iBeginBroadcast) {
                            try {
                                java.lang.Object broadcastCookie = remoteCallbackList2.getBroadcastCookie(i3);
                                aooh.d(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                                java.lang.Integer num = (java.lang.Integer) broadcastCookie;
                                int iIntValue = num.intValue();
                                java.lang.String str2 = (java.lang.String) map.get(num);
                                if (i5 != iIntValue && aooh.n(str, str2)) {
                                    try {
                                        defpackage.gfk gfkVar2 = (defpackage.gfk) remoteCallbackList2.getBroadcastItem(i3);
                                        android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                                        try {
                                            parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                                            parcelObtain.writeStringArray(strArrCreateStringArray);
                                            gfkVar2.a.transact(1, parcelObtain, null, 1);
                                            parcelObtain.recycle();
                                        } catch (java.lang.Throwable th) {
                                            parcelObtain.recycle();
                                            throw th;
                                        }
                                    } catch (android.os.RemoteException e) {
                                        android.util.Log.w("ROOM", "Error invoking a remote callback", e);
                                    }
                                }
                                i3++;
                            } catch (java.lang.Throwable th2) {
                                multiInstanceInvalidationService2.c.finishBroadcast();
                                throw th2;
                            }
                        }
                        multiInstanceInvalidationService2.c.finishBroadcast();
                        return true;
                    } catch (java.lang.Throwable th3) {
                        throw th3;
                    }
                }
            }
            android.os.IBinder strongBinder2 = parcel.readStrongBinder();
            if (strongBinder2 != null) {
                android.os.IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
                gfkVar = (iInterfaceQueryLocalInterface2 == null || !(iInterfaceQueryLocalInterface2 instanceof defpackage.gfk)) ? new defpackage.gfk(strongBinder2) : (defpackage.gfk) iInterfaceQueryLocalInterface2;
            }
            int i6 = parcel.readInt();
            aooh.f(gfkVar, "callback");
            androidx.room.MultiInstanceInvalidationService multiInstanceInvalidationService3 = this.a;
            android.os.RemoteCallbackList remoteCallbackList3 = multiInstanceInvalidationService3.c;
            synchronized (remoteCallbackList3) {
                remoteCallbackList3.unregister(gfkVar);
            }
            parcel2.writeNoException();
        }
        return true;
    }

    @Override // android.os.IInterface
    public final android.os.IBinder asBinder() {
        return this;
    }
}
