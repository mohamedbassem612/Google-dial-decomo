package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public interface IOnCheckedChangeListener extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.car.app.model.IOnCheckedChangeListener";
    public static final int VERSION = 1;

    int getInterfaceVersion();

    void onCheckedChange(boolean z, androidx.car.app.IOnDoneCallback iOnDoneCallback);

    /* JADX INFO: compiled from: PG */
    public abstract class Stub extends android.os.Binder implements androidx.car.app.model.IOnCheckedChangeListener {
        static final int TRANSACTION_getInterfaceVersion = 16777215;
        static final int TRANSACTION_onCheckedChange = 2;

        /* JADX INFO: compiled from: PG */
        final class Proxy implements androidx.car.app.model.IOnCheckedChangeListener {
            private int mCachedVersion = -1;
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                return this.mRemote;
            }

            public final java.lang.String getInterfaceDescriptor() {
                return DESCRIPTOR;
            }

            @Override // androidx.car.app.model.IOnCheckedChangeListener
            public int getInterfaceVersion() {
                if (this.mCachedVersion == -1) {
                    android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                    android.os.Parcel parcelObtain2 = android.os.Parcel.obtain();
                    try {
                        parcelObtain.writeInterfaceToken(DESCRIPTOR);
                        this.mRemote.transact(androidx.car.app.model.IOnCheckedChangeListener.Stub.TRANSACTION_getInterfaceVersion, parcelObtain, parcelObtain2, 0);
                        parcelObtain2.readException();
                        this.mCachedVersion = parcelObtain2.readInt();
                    } finally {
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                    }
                }
                return this.mCachedVersion;
            }

            @Override // androidx.car.app.model.IOnCheckedChangeListener
            public void onCheckedChange(boolean z, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
                android.os.Parcel parcelObtain = android.os.Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(DESCRIPTOR);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(iOnDoneCallback);
                    if (!this.mRemote.transact(2, parcelObtain, null, 1)) {
                        throw new android.os.RemoteException("Method onCheckedChange is unimplemented.");
                    }
                    parcelObtain.recycle();
                } catch (java.lang.Throwable th) {
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static androidx.car.app.model.IOnCheckedChangeListener asInterface(android.os.IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof androidx.car.app.model.IOnCheckedChangeListener)) ? new androidx.car.app.model.IOnCheckedChangeListener.Stub.Proxy(iBinder) : (androidx.car.app.model.IOnCheckedChangeListener) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) {
            if (i > 0 && i <= TRANSACTION_getInterfaceVersion) {
                parcel.enforceInterface(DESCRIPTOR);
            }
            if (i == TRANSACTION_getInterfaceVersion) {
                parcel2.writeNoException();
                parcel2.writeInt(getInterfaceVersion());
                return true;
            }
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            onCheckedChange(parcel.readInt() != 0, androidx.car.app.IOnDoneCallback.Stub.asInterface(parcel.readStrongBinder()));
            return true;
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return this;
        }
    }

    /* JADX INFO: compiled from: PG */
    public class Default implements androidx.car.app.model.IOnCheckedChangeListener {
        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public int getInterfaceVersion() {
            return 0;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(boolean z, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        }
    }
}
