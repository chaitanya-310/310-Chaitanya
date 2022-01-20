import mongoose from 'mongoose';

const User = mongoose.model( 'User' );

const fetchUsers = () => {
    return User
            .find()
            .select( '-password' )
};

export {
    fetchUsers
};